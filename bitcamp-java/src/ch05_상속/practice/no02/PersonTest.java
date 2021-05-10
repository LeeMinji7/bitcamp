package ch05_상속.practice.no02;

class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}

class Student extends Person{
	int studentNum;
	Student(String name, int age, int studentNum){
		super(name, age);
		this.studentNum = studentNum;
	}
	
	void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, studentNum);
	}
}

class ForeignStudent extends Student{
	String country;
	ForeignStudent(String name, int age, int studentNum, String country){
		super(name, age, studentNum);
		this.country = country;
	}
	
	void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, studentNum, country);
	}
}
public class PersonTest {

	public static void main(String[] args) {

		Person[] p = {new Person("길동이", 22)
				, new Student("황진이", 23, 100)
				, new ForeignStudent("Amy", 30, 200, "U.S.A")};

		for(Person pp : p)
			pp.show();
	}

}
