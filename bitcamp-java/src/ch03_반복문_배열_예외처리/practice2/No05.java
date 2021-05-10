package ch03_반복문_배열_예외처리.practice2;

public class No05 {

	public static void main(String[] args) {

		int a,b,c;
		
		for(a=1; a<10; a++) {
			for(b=1; b<10; b++) {
				for(c=1; c<10; c++) {
					if((((a+b+c)<=20) && ((a*a+b*b) == c*c))){
						System.out.println("(a, b, c) = " + "(" + a + ", " + b + ", " + c+ ")");
					}
				}
			}
		}
	}
}
