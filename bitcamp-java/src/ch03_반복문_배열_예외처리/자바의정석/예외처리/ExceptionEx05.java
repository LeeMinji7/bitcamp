package ch03_반복문_배열_예외처리.자바의정석.예외처리;

class ExceptionEx05 {
	public static void main(String args[]) {
			System.out.println(1);			
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(0/0);	
				System.out.println(4); 	// 실행되지 않는다.
			} catch (ArithmeticException ae)	{
				System.out.println(5);
			}	// try-catch의 끝
			System.out.println(6);
	}	// main메서드의 끝
}
