package JavaTask1;

import java.util.Scanner;

public class QuetionNo04 {

	static int a;
	static int b;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A numbers");
		a = sc.nextInt();

		System.out.println("Enter the value of B numbers");
		b = sc.nextInt();

		System.out.println("Value Before Swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value After Swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
