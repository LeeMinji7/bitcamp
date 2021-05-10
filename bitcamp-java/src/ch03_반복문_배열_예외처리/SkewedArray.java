package ch03_반복문_배열_예외처리;

public class SkewedArray {

	public static void main(String[] args) {

		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int[3]; // 첫째 행의 정수 3개의 배열 생성
		intArray[1] = new int[2]; // 둘째 행의 정수 3개의 배열 생성
		intArray[2] = new int[3]; // 셋째 행의 정수 3개의 배열 생성
		intArray[3] = new int[2]; // 넷째 행의 정수 3개의 배열 생성
		
		for (int i=0; i<intArray.length; i++) // 행에 대한 반복
			for(int j=0; j<intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (i+1) *10 + j;
	
		for (int i=0; i<intArray.length; i++) { // 행에 대한 반복
			for(int j=0; j<intArray[i].length; j++) // 열에 대한 반복
				System.out.print(intArray[i][j] + " ");
		System.out.println();
		}
	}

}
