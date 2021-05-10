package ch03_반복문_배열_예외처리.practice1;

public class No10 {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];
		int count=0;
		
		while(count < 10) {
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*4);
			
			if(arr[i][j] == 0) {
				arr[i][j] = (int)(Math.random()*10 + 1);
				count++;
			}				
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
