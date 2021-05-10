package ch03_¹Ýº¹¹®_¹è¿­_¿¹¿ÜÃ³¸®.practice2;

import java.util.Scanner;

public class No07 {

	public static void main(String[] args) {

		
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		
		whoWin(c, y);
		
	}

	static String input(String s) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(s + ": ");
		s = sc.next();
		return s;
	}
	
	static void whoWin(String c, String y) {
		if(c.equals("s")) {
			if(y.equals("s"))
				System.out.println("¹«½ÂºÎ");
			else if(y.equals("r"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		}
		else if(c.equals("r")) {
			if(y.equals("s"))
				System.out.println("Ã¶¼ö, ½Â!");
			else if(y.equals("r"))
				System.out.println("¹«½ÂºÎ");
			else
				System.out.println("¿µÈñ, ½Â!");
		}
		else {
			if(y.equals("s"))
				System.out.println("¿µÈñ, ½Â!");
			else if(y.equals("r"))
				System.out.println("Ã¶¼ö, ½Â!");
			else
				System.out.println("¹«½ÂºÎ");
		}
	}

}
