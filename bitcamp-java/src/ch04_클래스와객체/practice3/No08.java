package ch04_클래스와객체.practice3;

public class No08 {
	public static void searchBomb(int m, int n, double p) {
		String[][] arr = new String[m][n];
		int[][] num = new int[m][n];
	
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = "_";
				if((Math.random()) < p)
					arr[i][j] = "*";
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				
				
//				if(i<0 || i>
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
