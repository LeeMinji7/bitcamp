package ch04_클래스와객체.practice3;

import java.util.Arrays;

public class No06 {
	public static int[] reverse(int[] org) {
		int[] temp = new int[org.length];
		for(int i=0; i<org.length; i++) {
			temp[i] = org[org.length-1-i];
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] org = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(reverse(org)));
	}

}
