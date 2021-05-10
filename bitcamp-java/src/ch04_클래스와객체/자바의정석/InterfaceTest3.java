package ch04_Ŭ�����Ͱ�ü.�ڹ�������;

class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}

 class A {
    void methodA() {
          I2 i = InstanceManager.getInstance();
		  i.methodB();
		  System.out.println(i.toString()); // i�� ObjectŬ������ �޼��� ȣ�Ⱑ��
     }
 }

 interface I2 {
      public abstract void methodB();
 }

 class B implements I2 {
     public void methodB() {
          System.out.println("methodB in B class");
     }

	  public String toString() { return "class B";}
 }

 class InstanceManager {
	public static I2 getInstance() {
		return new B();
	}
 }
