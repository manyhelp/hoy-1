package ws.hoyland.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println((0x3e8 % 01701 & 67));
		// TODO Auto-generated method stub
		String[][] ss = new String[][]{
				{"[20,[\"de\",\"2_1201670559\"]]", "[400]"},
				{"[1,"+System.currentTimeMillis()+"]", "[400,0]"}, //1399178348003
				{"[2,[\"Firefox\",\"29\",\"Windows\"]]", "[400,0,2]"},
				{"[12,\""+System.currentTimeMillis()+":"+Math.random()+"\"]", "[400,0,2,141]"}, //[12, '1399128248811:0.42184435530609143']
				{"[19,[1,1811,4,\" r4l\"]]", "[400,0,2,141,357]"},
				{"[8,\"\"]", "[400,0,2,141,357,59]"},
				{"[9,\"\"]", "[400,0,2,141,357,59,75]"},
				{"[11,[\"https://login.taobao.com/member/login.jhtml\",\"\"]]", "[400,0,2,141,357,59,75,114]"},
				{"[3,[71,0,1423,637,1440,900,1440,860]]", "[400,0,2,141,357,59,75,114,1]"}
		};
		
		/**
		"[10, '[21913,"1399201917948|0.32573185542507377",1]']" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 91]" ua.js:1226
		"log=069fCJmZk4PGRVHHxtOZXIsaHUwZCZ6P3J2TGU=|fyJ6Zyd9Nm0tbH4vbX8iZhc=|fiB4D157YHtufDUqfHY4fms6dSUbAhhaUlEESmMS|eSRiYjNhIHA5f2k7e2sycWotdDZxNXRkMXZkMHNnIHczYiNjdjMa|eCVoaEAQThFXFx1IEBRBFRs1Cw==|ey93eSgW|ei93eSgW|dShtbUUEHgMHA1YLUFlZQgkTHkJfTlURFwwECxBRDQMUEAITRw8XXlVICldeRFlEXFgTRUFwWQ==|dCtzBE4ZRx5CBxVABw1XFg5RA0UYWAAfSAwGWxsDQA9FGlpzCA==|dypubj8HRx9WEwZNZWE8e24kdTdvJmNyLGxyYiYkZDVyLG8qNGYnNWsqNnIiZzkVQ0kfNjID|di5qdil6JH8jZnQiem82dXUzaTdpLHRjNXV/InpvLRM=" ua.js:1729
		console.trace(): ua.js:1730
		q3t() ua.js:1730
		q1() ua.js:1228
		xmk() ua.js:1053 of 2054

		"[13, ['Windows 7', 'WIN 12,0,0,77']]" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 91, 159]" ua.js:1226
		"log=049fCJmZk4PGRVHHxtOZXIsaHUwZCZ6P3J2TGU=|fyJ6Zyd9Nm0tbH4vbX8iZhc=|fiB4D157YHtufDUqfHY4fms6dSUbAhhaUlEESmMS|eSRiYjNhIHA5f2k7e2sycWotdDZxNXRkMXZkMHNnIHczYiNjdjMa|eCVoaEAQThFXFx1IEBRBFRs1Cw==|ey93eSgW|ei93eSgW|dShtbUUEHgMHA1YLUFlZQgkTHkJfTlURFwwECxBRDQMUEAITRw8XXlVICldeRFlEXFgTRUFwWQ==|dCtzBE4ZRx5CBxVABw1XFg5RA0UYWAAfSAwGWxsDQA9FGlpzCA==|dypubj8HRx9WEwZNZWE8e24kdTdvJmNyLGxyYiYkZDVyLG8qNGYnNWsqNnIiZzkVQ0kfNjID|ditsbEQFICA+Lmd3cHYte3sqHiUCUhcDSAwGWgIZXRwzBw==|cSltcS59I3gkYXMlfWgxcnI0bjBuK3NkMnJ4JX1oKmUmejMa" ua.js:1729
		console.trace(): ua.js:1730
		q3t() ua.js:1730
		q1() ua.js:1228
		ixm() ua.js:1524 of 2046
		**/
		
		/**
		"[13, ['Windows 7', 'WIN 12,0,0,77']]" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 160]" ua.js:1226
		
		"[10, '[21913,"1399201917948|0.32573185542507377",1]']" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 160, 90]" ua.js:1226
		
		"[5, ['J_SubmitStatic', [934, 304], 0, '', 4482]]" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 160, 90, 14]" ua.js:1226
		
		"[7, ['J_SubmitStatic', 1, 4489]]" ua.js:1225
		"[400, 0, 2, 141, 357, 59, 75, 114, 1, 160, 90, 14, 37]" ua.js:1226
		**/
//		String s = "[20,[\"de\",\"2_1201670559\"]]";
//		s = "[20,[\"to\",[125134,1399173180237,\"20\"]]]";
//		s = "[400]";
//		s = "[400,399]";
		Base64 base64 = new Base64();

		String bj = null;
		int op = 0;
		
		for(int i=0;i<ss.length;i++){
			String sx = "";
			String s = "";
			for(int j=0;j<ss[i].length;j++){
				op++;
				//1
				sx = rwz(ss[i][j]);
				//2
				if(op!=0){
					sx = t8ka(sx, op);
				}else{
					//do nothing
				}
				//3
				if(j==0){
					s = base64.encodeAsString(sx.getBytes());
				}else{
					s += "|"+base64.encodeAsString(sx.getBytes());
				}
			}
			
			if(bj==null){
				bj = "123"+s;
			}else{
				bj = bj.substring(0, bj.lastIndexOf("|"))+"|"+s;
			}
			
			bj = bj.substring(3);
			
			String ps = "";
			int prefix = 0;
			
//			bj = "fCJmZk4PGRVHHxtOZXIsaHUwZCZ6P3J2TGU=|fydjf1E=";
			//1
			prefix = zq61(prefix, bj);
			
			//2
			prefix = (prefix-1) & 0xff;
			
			//3
			if(prefix<10){
				ps = "00"+prefix;
			}else if(prefix<100){
				ps = "0"+prefix;
			}else{
				ps = ""+prefix;
			}
			bj = ps+bj;
			op--;
			System.out.println(bj);
		}
		
		
//		System.out.println(s.length());
//		System.out.println(s);
		
//		System.out.println(s.length());
//		System.out.println(s);
//		s = base64.encodeAsString(s.getBytes());
		System.out.println();
		System.out.println(bj);
		try {
			System.out.println(URLEncoder.encode(bj, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String rwz(String lscx){
			String bj = "";
			String wn = "&lt,script&gt";
			int i7v = 0;
			int w04a = 0;
			for (int i = 0; i < lscx.length(); i++) {
				for (int dp3s = 0; dp3s < 3; dp3s++) {
					if (dp3s == 0) {//0
						w04a = (byte)lscx.charAt(i);
						//System.out.println((byte)lscx.charAt(i));
					} else if (dp3s == 1) {//1
						w04a = (w04a ^ (byte)wn.charAt(i7v));
//						System.out.println(w04a);
					}else if (dp3s == 2) {//2
						i7v++;
					}
				}
				if (i7v >= wn.length()){
					i7v = 0;
				}
				bj += (char)(w04a & 255);	
			}
			return bj;
	}
	
	private static String t8ka(String hf2, int op){
		String ohwp = "";
		int w04a = 0;
		int ru = 0;
		for (int rwz = 0; rwz < hf2.length(); rwz++) {
			int q8 = 0;
			for (int mq = 0; mq <= 7; q8 = ++mq + mq+++mq) {
				if (mq == q8) {
					w04a = (byte)hf2.charAt(rwz);
					continue;
				}
				if (2 * mq == q8 - 5) {
					ohwp += (char)(ru & 255);
					break;
				}
				if (2 * mq == q8 - 2) {
					op = ru;
					mq++;
				}
				if (3 * mq == q8 + 2) {
					ru = w04a^op;
				}
			}
		}
//		System.out.println(ohwp.length());
		return ohwp;
	}
	
	private static int zq61(int ohwp, String hw3){
		int bpe = 0;
//		int ow = 0;
		for (int i = 0; i < hw3.length(); bpe++) {
//			int x = ((byte)hw3.charAt(i))&0xff << 0;
//			System.out.println(~x);
			ohwp = (ohwp + ~ (((byte)hw3.charAt(i))&0xff << 0)) & 255;
//			System.out.println(ohwp);
			if (bpe % 2 == 0) {
				i = i + 3;
			} 
			else {
				i = i + 4;
			}
		}
//		System.out.println(ohwp);
		return ohwp;
	}
}
