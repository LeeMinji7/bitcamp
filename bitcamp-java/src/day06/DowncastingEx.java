package day06;
class Person3{
	String name;
	String id;
	
	public Person3(String name) {
		this.name = name;
	}
}
class Student3 extends Person3{
	String grade;
	String department;
	
	public Student3(String name) {
		super(name);
	}
}
public class DowncastingEx {

	public static void main(String[] args) {
		Person3 p;
		Student3 s = new Student3("이재문");
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		
		s = (Student3)p; // 다운 캐스팅
		System.out.println(s.name);
		s.grade = "A";

	}

}
