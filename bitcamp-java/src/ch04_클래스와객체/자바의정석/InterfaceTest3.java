package ch04_클래스와객체.자바의정석;

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
		  System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
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
