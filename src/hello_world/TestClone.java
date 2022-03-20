package hello_world;

public class TestClone{
	public static void main(String[] args) {
		TestObjectClone testObject = new TestObjectClone();
		try {
		TestObjectClone clonedObject = (TestObjectClone)testObject.clone();
		clonedObject.display();
		testObject.display();
		}
		catch (CloneNotSupportedException c) {
			System.out.println("Exception Occurred while cloning");
		}
	}
}

class TestObjectClone implements Cloneable{
	private int a;
	private String b;
	TestObjectClone(){
		a = 5;
		b = "naman";
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display() {
		System.out.println(this.a +" "+this.b);
	}
}

