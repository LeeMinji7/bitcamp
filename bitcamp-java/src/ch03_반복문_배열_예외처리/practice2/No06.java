package ch03_¹Ýº¹¹®_¹è¿­_¿¹¿ÜÃ³¸®.practice2;

import java.util.Scanner;

public class No06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ã¶¼ö: ");
		String manSelect = sc.next();
		
		System.out.print("¿µÈñ: ");
		String womanSelect = sc.next();
		
		if(manSelect.equals("s")) {
			if(womanSelect.equals("s"))
				System.out.println("¹«½ÂºÎ");
			else if(womanSelect.equals("r"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		}
		else if(manSelect.equals("r")) {
			if(womanSelect.equals("s"))
				System.out.println("Ã¶¼ö, ½Â!");
			else if(womanSelect.equals("r"))
				System.out.println("¹«½ÂºÎ");
			else
				System.out.println("¿µÈñ, ½Â!");
		}
		else {
			if(womanSelect.equals("s"))
				System.out.println("¿µÈñ, ½Â!");
			else if(womanSelect.equals("r"))
				System.out.println("Ã¶¼ö, ½Â!");
			else
				System.out.println("¹«½ÂºÎ");
		}
	}
}
