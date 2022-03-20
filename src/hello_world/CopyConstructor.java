package hello_world;

public class CopyConstructor {
	static Test t1 = new Test();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(1, 15);
		Test copy = new Test(t);
		System.out.println(t.id + " " + t.age);
		System.out.println(copy.id + " " + copy.age);
		System.out.println(new Test(2, 30));
		System.out.println(t1);

	}

}

class Test{
	int id;
	int age;
	Test(){
		System.out.println("calling constructor from constructor");
	}
	Test(int id, int age){
		this();
		this.id = id;
		this.age = age;
	}
	
	Test(Test t){
		this();
		id = t.id;
		age = t.age;
	}
}
