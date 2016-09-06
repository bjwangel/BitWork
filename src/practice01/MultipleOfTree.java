package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("판별할 수를 입력하세요");
		int num=scanner.nextInt();
		scanner.close();
		
		if(num%3==0){
			System.out.println(num+"은 3의 배수 입니다.");
		}else{
			System.out.println(num+"은 3의 배수가 아닙니다.");
		}
	}
}
