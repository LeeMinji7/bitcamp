package ch04_클래스와객체.practice3;

public class No08 {
	public static String[][] searchBomb(int m, int n, double p) {
		String[][] num = new String[m+2][n+2];
		boolean[][] bomb = new boolean[m+2][n+2];
		int[][] bombTF = new int[m+2][n+2];
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				bomb[i][j] = (Math.random() < p);
				if(bomb[i][j]) {
					System.out.print("* ");
					bombTF[i][j] = 1;
				}
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(bombTF[i][j] == 1)
					num[i][j] = "*";
				else {
				num[i][j] = String.valueOf(bombTF[i-1][j-1] + bombTF[i-1][j] + bombTF[i-1][j+1] + bombTF[i][j-1] 
											+ bombTF[i][j] + bombTF[i][j+1] + bombTF[i+1][j-1] + bombTF[i+1][j] + bombTF[i+1][j+1]);
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		double p = Double.parseDouble(args[2]);
		String[][] numOfBomb = searchBomb(m,n,p);
		
		System.out.println();
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(numOfBomb[i][j] + " ");
			}
			System.out.println();
		}
	}
}
