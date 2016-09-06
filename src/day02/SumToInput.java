package day02;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력");
		int keyboard = input.nextInt();
		input.close();

		int a = 0;

		for (int i = 1; i <= keyboard; i++) {
			a = a + i;
		}
		System.out.println(a);
	}

}
