package JavaTask1;

import java.util.Scanner;

public class QuetionNo02 {

	static int num;

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("It is an Even Number");
		} else {
			System.out.println("It is an Odd Number");
		}

	}

}
