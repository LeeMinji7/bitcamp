package ch03_�ݺ���_�迭_����ó��.practice1;

public class No13 {

	public static void main(String[] args) {

		for(int i=1; i<100; i++) {
			if(i<10) {
				if((i%3) == 0)
					System.out.println(i + " �ڼ� ¦");
			}
			else {
				boolean tens = (i/10) % 3 == 0;
				boolean units = (i%10) % 3 == 0;
				

				if((i%10) == 0) {  
					units = false;
				}
				
				if(tens && units)
					System.out.println(i + " �ڼ� ¦¦");
					
				else if(tens || units)
					System.out.println(i + " �ڼ� ¦");
			}
		}
	}
}
