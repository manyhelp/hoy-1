package ws.hoyland.vc;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;

public class Sender implements Runnable {

	private SocketChannel sc;
	private boolean run;
	private byte[] data = new byte[1024]; // 此处的1024可以情况进行调整，应跟下面的1024应保持一致
	private int numBytesRead = 0;
	private TargetDataLine line = null;

	public Sender(SocketChannel sc) {
		this.sc = sc;
		this.run = true;

		// 采集并发送
		AudioFormat format = new AudioFormat(//AudioFormat.Encoding.PCM_SIGNED,
				8000, // sampleRate
				16, // sampleSizeInBits
				2, // channels
				true,
				true); // bigEndian

		DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

		try {
			line = (TargetDataLine) AudioSystem.getLine(info);
			line.open(format, line.getBufferSize());
		} catch (Exception e) {
			e.printStackTrace();
		}// end catch

		// line.start();
	}

	public void stop() {
		this.run = false;
	}

	@Override
	public void run() {
		line.start();

		while (run) {
			try {
//				synchronized (this) {
//					this.wait(100);
//				}

				numBytesRead = line.read(data, 0, 1024);// 取数据（1024）的大小直接关系到传输的速度，一般越小越快，
				byte[] bs = new byte[numBytesRead+2];
				bs[0] = 0xF;
				bs[1] = 0xD;
				for(int i=0;i<numBytesRead;i++){
					bs[i+2] = data[i];
				}
				try {
					//sc.write(ByteBuffer.wrap(Util.slice(data, 0, numBytesRead)));// 写入网络流
					sc.write(ByteBuffer.wrap(bs));// 写入网络流
				} catch (Exception ex) {
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		line.stop();
		line.close();
		line = null;
	}

}
