package day03;

// 3�� ���, ¦��, Ȧ�� ��

public class ForSample2 {
	public static void main(String[] args) {

		int sum = 0; // 3�� ����� ��
		int sum2 = 0; // ¦���� ��
		int sum3 = 0; // Ȧ���� ��
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 ==0)
				sum += i;
			
			if(i % 2 == 0)
				sum2 += i;
			else
				sum3 += i;
		}
		
		System.out.println("3�� ����� ��: " + sum);
		System.out.println("¦���� ��: " + sum2);
		System.out.println("Ȧ���� ��: " + sum3);
	}
}
