package JavaTask1;

import java.util.Scanner;

public class QuetionNo09 {
	static int age;

	public static void main(String[] args) {

		System.out.println("Enter the persion Age");

		Scanner sc = new Scanner(System.in);

		age = sc.nextInt();

		if (age >= 60) {
			System.out.println("The person is a senior citizen");
		} else {
			System.out.println("The person is NOT a senior citizen");
		}

	}

}
