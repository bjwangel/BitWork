package prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");

		String s = scanner.next();
		String B=s.toUpperCase();
		int size = B.length();

		char[] arr = new char[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = B.charAt(i);
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<i;j++){
				System.out.print(arr[i]);
			}System.out.println("");
		}

		scanner.close();
	}
}
