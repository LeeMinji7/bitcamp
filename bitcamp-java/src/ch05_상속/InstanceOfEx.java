package ch05_»ó¼Ó;
class Person4{}
class Student4 extends Person4{}
class Researcher extends Person4{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person4 p) {
		if(p instanceof Person4) System.out.println("person: ");
		if(p instanceof Student4) System.out.println("Student: ");
		if(p instanceof Researcher) System.out.println("Researcher: ");
		if(p instanceof Professor) System.out.println("Professor: ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> \t");	print(new Student4());
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); 	print(new Professor());
	}
}
