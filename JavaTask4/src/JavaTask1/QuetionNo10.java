package JavaTask1;

import java.util.Scanner;

public class QuetionNo10 {

	static int num;

	public static void main(String[] args) {

		System.out.println("Enter any Number");

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		int digitCount = Integer.toString(num).length();

		System.out.println("The number of digits is:: " + digitCount);

	}

}
