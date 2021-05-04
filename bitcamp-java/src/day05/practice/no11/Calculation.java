package day05.practice.no11;

import java.util.Scanner;

abstract class Operator{
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	abstract int calculate();
}
class Add extends Operator{

	@Override
	int calculate() {
		return  getA() + getB();
	}
}
class Sub extends Operator{
	@Override
	int calculate() {
		return  getA() - getB();
	}
}
class Mul extends Operator{
	@Override
	int calculate() {
		return  getA() * getB();
	}
}
class Div extends Operator{
	@Override
	int calculate() {
	return  getA() - getB();
	}
}
public class Calculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		String op = sc.next();
		
		switch(op) {
		case "+": 
			Add add = new Add();
			add.setValue(op1, op2);
			System.out.println(add.calculate());
			break;
		case "-": 
			Sub sub = new Sub();
			sub.setValue(op1, op2);
			sub.calculate();
			System.out.println(sub.calculate());
			break;
		case "*": 
			Mul mul = new Mul();
			mul.setValue(op1, op2);
			System.out.println(mul.calculate());
			break;
		case "/": 
			Div div = new Div();
			div.setValue(op1, op2);
			System.out.println(div.calculate());
			break;
		}	
	}
}
