package hello_world;

import java.util.*;

public class switchClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		switch (a) {
		case 1:
			System.out.println("One is entered");
			break;
		case 2:
			System.out.println("2 is entered");
			break;
		default:
			System.out.println("default");
		}

	}
}
