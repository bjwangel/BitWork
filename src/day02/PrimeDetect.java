package day02;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("소수 판단할 숫자?");
		int div = 2;
		int num = input.nextInt();
		input.close();
		boolean isprime = true;

		while (isprime==true) {
			if (num % div == 0 && num != div) {
				System.out.println(num + "은 소수가 아닙니다.");
				isprime=false;
			} else if (num % div == 0 && num == div) {
				System.out.println(num + "은 소수입니다.");
				isprime=false;
			} else {
				div++;
			}
		}

	}

}
