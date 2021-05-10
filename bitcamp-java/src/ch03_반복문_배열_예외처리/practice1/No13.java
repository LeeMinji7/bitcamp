package ch03_반복문_배열_예외처리.practice1;

public class No13 {

	public static void main(String[] args) {

		for(int i=1; i<100; i++) {
			if(i<10) {
				if((i%3) == 0)
					System.out.println(i + " 박수 짝");
			}
			else {
				boolean tens = (i/10) % 3 == 0;
				boolean units = (i%10) % 3 == 0;
				

				if((i%10) == 0) {  
					units = false;
				}
				
				if(tens && units)
					System.out.println(i + " 박수 짝짝");
					
				else if(tens || units)
					System.out.println(i + " 박수 짝");
			}
		}
	}
}
