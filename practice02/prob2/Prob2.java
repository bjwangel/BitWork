package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();

		int hsum = 0;
		int zsum = 0;

		if (inputNumber % 2 == 1) {
			for (int i = 0; i <= inputNumber; i++) {
				if (i % 2 == 1) {
					hsum = hsum + i;
				}
			}
			System.out.println("입력값까지 홀수의 합" + hsum);
		} else if (inputNumber < 1) {
			System.out.println("1이상의 양수릅 입력하세요");
		} else {
			for (int i = 0; i <= inputNumber; i++) {
				if (i % 2 == 0) {
					zsum = zsum + i;
				}
			}
			System.out.println("입력값까지 짝수의 합" + zsum);
		}

		scanner.close();
	}

}
