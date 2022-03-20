package hello_world;

public class AbstractClass {
	public static void main(String[] args) {
		TestAbstract t1 = new AbstractTester();
		t1.abstractMethod();
	}
}

abstract class TestAbstract {
	public int age=1;
	abstract void abstractMethod();
	void nonAbstractMethod() {
		System.out.println("Non Abstract Method");
	}
	public static void staticMethod() {
		System.out.println("Static Method");
	}
}

class AbstractTester extends TestAbstract{
	void abstractMethod() {
		System.out.println("Abstract Method defined");
	}
}
