package ch03_�ݺ���_�迭_����ó��.�ڹ�������.����ó��;
class ExceptionEx17 {
	public static void main(String[] args) 
	{
		try  {
			method1();		
		} catch (Exception e)	{
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}	// main�޼����� ��

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;			// �ٽ� ���ܸ� �߻���Ų��.
		}
	}	// method1�޼����� ��
}
