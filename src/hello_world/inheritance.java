package hello_world;

public class inheritance {
	public static void main(String[] args) {
		Student s = new Student(1, "naman");
//		System.out.println(s.name);
		Person1 p1 = new Person1(1, "piyush");
		s.work();
		System.out.println("age modified");
//		s.display();
	}
}	

class Person1 {
	protected static String name;
	public int age;
	static final int salary;
	Person1(int age, String name){
		this.age = age;
		this.name = name;
		Math.log1p(1);
	}
	
	static {salary = 10;}
	
	void display() {
		System.out.println(this.age + "" + name);
	}
}

class Student extends Person1 {
//	public String name;
	Student(int age, String name) {
		super(age, name);
		System.out.println("called student constructor");
		System.out.println("Student:" + this.age + " " + this.name);
	}
	
	void work() {
		super.age = 2;
		name = "aman";
		super.display();
		System.out.println("Salary :" + salary);
	}
	
	void display() {
		System.out.println("overrde display");
	}
}
