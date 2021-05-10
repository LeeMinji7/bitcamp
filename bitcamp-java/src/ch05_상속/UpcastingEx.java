package ch05_상속;
class Person2{
	String name;
	String id;
	
	public Person2(String name) {
		this.name = name;
	}
}
class Student2 extends Person2{
	String grade;
	String department;
	
	public Student2(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Person2 p;
		Student2 s = new Student2("이재문");
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		
//		p.grade = 'A'; // 오류
//		p.department = "Com"; // 오류

	}

}
