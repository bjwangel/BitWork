package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		int guess = 0;
		int max = 100;
		int min = 0;
		Random r = new Random();
		int k = r.nextInt(100) + 1;

		System.out.println("1~100 사이 숫자를 맞혀보세요");
		Scanner input = new Scanner(System.in);

		while (guess != k) {
			guess = input.nextInt();
			if (k == guess) {
				System.out.println("정답입니다.");
			} else if (k > guess) {
				System.out.println("더 높게");
				min = guess;
				System.out.println(min + "~" + max);
			} else {
				System.out.println("더 낮게");
				max = guess;
				System.out.println(min + "~" + max);
			}
		}
		input.close();
	}
}
