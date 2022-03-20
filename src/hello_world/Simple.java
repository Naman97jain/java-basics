package hello_world;
//import packageFunctionality.Simple;

public class Simple {

	public static void main(String[] args) {
		System.out.println("Hello World!");
//		ClassLoaderTest clt = new ClassLoaderTest();
		ClassLoaderTest.ClassLoaderTestMain();
		LoopLearn.main();
		switchClass.main(args);
	}
}

class ClassLoaderTest {
	public static void ClassLoaderTestMain() {
		Class c = ClassLoaderTest.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}
}

class LoopLearn {
	public static void main() {
		a: for (int i = 0; i < 5; i++) {
			 for (int j = 6; j < 10; j++) {
				if (j == 8) {
					break a;
				}
				System.out.println(j);
			}
			System.out.println(i);
		}
	}
}
