package ch06_lang패키지;
import java.util.StringJoiner;

class StringEx5 {
	public static void main(String[] args) throws Exception {
		String str = "가";

		byte[] bArr  = str.getBytes("UTF-8"); // str을 utf-8(3바이트)로 인코딩한 값
		byte[] bArr2 = str.getBytes("CP949"); // str을 cp949(2바이트)로 인코딩한 값

		System.out.println("UTF-8:" + joinByteArr(bArr));
		System.out.println("CP949:" + joinByteArr(bArr2));

		System.out.println("UTF-8:" + new String(bArr,  "UTF-8")); // bArr을 utf-8로 디코딩
		System.out.println("CP949:" + new String(bArr2, "CP949"));
	}

	static String joinByteArr(byte[] bArr) {
		 StringJoiner sj = new StringJoiner(":", "[", "]");

		for(byte b : bArr)
			sj.add(String.format("%02X",b));

		return sj.toString(); // 문자열로 치환
	}
}
