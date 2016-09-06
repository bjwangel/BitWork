package day02;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		if (n1 > n2) {
			System.out.println("n1:" + n1);
			System.out.println("n2:" + n2);
		} else if (n1 < n2) {
			System.out.println("n1:" + n2);
			System.out.println("n2:" + n1);
		}

		int a = 1;
		int b = 2;
		int c = 3;

		if (a > b && a > c) {
			System.out.println("최대값 a:" + a);
		} else if (b > a && b > c) {
			System.out.println("최대값 b:" + b);
		} else if (c > a && c > b) {
			System.out.println("최대값 c:" + c);
		}

	}

}
