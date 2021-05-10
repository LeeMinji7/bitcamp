package ch06_langÆÐÅ°Áö;
class StringEx2 {
	public static void main(String args[]) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = new String("AAA");
//		String s4 = "BBB";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));	
	}
}
