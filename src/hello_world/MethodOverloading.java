package hello_world;

public class MethodOverloading {
	public static void main(String[] args) {
//		Person p1 = new Person();
		System.out.println(Person.add(1,2,3));
		System.out.println(Person.add(1,2));
	}

}

class Person{
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static int add(int a, int b) {
		return a + b;
	}
}
