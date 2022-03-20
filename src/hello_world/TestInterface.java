package hello_world;

public class TestInterface {
	public static void main(String...args) {
		Drawable d = new TestMultipleInheritance();
		d.test();
		Drawable.run();
		Showable.run();
		
	}
}

interface Drawable {
	public static void run() {
		System.out.println("Static method in Drawable");
	}
	
	public default void test() {
		System.out.println("Testing in Drawable");
	}
	
	public void draw();
}

interface Showable {
	public static void run() {
		System.out.println("Static method in Showable");
	}
	public default void test() {
		System.out.println("Testing in Showable");
	}
	
	public void show();
}

class TestMultipleInheritance implements Drawable, Showable {

	public void test() {
		// TODO Auto-generated method stub
		Showable.super.test();
	}
	
	public void show() {
		System.out.println("Showing in class");
	}
	
	public void draw() {
		System.out.println("Drawing in class");
	}
	
}
