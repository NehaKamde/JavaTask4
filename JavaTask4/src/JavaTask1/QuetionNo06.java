package JavaTask1;

import java.util.Scanner;

public class QuetionNo06 {
	static int fact = 1;
	static int num;

	public static void main(String[] args) {
		System.out.println("Enter any Anumber to fine the Factorial");
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}
		System.out.println("Factorial of a number  : " + fact);

	}

}
