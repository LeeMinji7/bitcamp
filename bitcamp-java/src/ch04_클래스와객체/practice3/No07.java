package ch04_클래스와객체.practice3;

public class No07 {

	public static boolean equal(int[] a, int[] b) {
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i] == b[i])
					continue;
				else
					return false;
			}
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {

		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
		if(equal(a,c))
			System.out.println("두 배열이 같다");
		else
			System.out.println("두 배열은 다르다");
	}

}
