package practice01;

public class Game369 {
	public static void main(String[] args) {

		int num = 1;

		for (num = 1; num < 100; num++) {
			String s = String.valueOf(num);
			if (num < 10) {
				char c1 = s.charAt(0);
				if (c1 == 3 || c1 == 6 || c1 == 9) {
					System.out.println(num + "짝!!");
				}
			}
			if (num >= 10 && num < 100) {
				char c2 = s.charAt(0);
				char c3 = s.charAt(1);
				if (c2 == 3 || c2 == 6 || c2 == 9) {
					System.out.print(num + "짝!!"); // 줄 바꾸지 않음
				}
				if (c3 == 3 || c3 == 6 || c3 == 9) {
					System.out.println("짝!!"); // 줄 바꿈
				} else {
					System.out.println("");
				}
			}
		}

	}
}
