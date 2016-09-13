package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요");
		Scanner input=new Scanner(System.in);
		int money=input.nextInt();
		input.close();
		
		int mok,na,$50000원,$10000원,$5000원,$1000원,$500원=0;
		int $100원,$50원,$10원=0;
		
		mok=money/50000;
		na=money%50000;
		$50000원=mok;
		
		mok=na/10000;
		na=money%10000;
		$10000원=mok;
		
		mok=na/5000;
		na=money%5000;
		$5000원=mok;
		
		mok=na/1000;
		na=money%1000;
		$1000원=mok;
		
		mok=na/500;
		na=money%500;
		$500원=mok;
		
		mok=na/100;
		na=money%100;
		$100원=mok;
		
		mok=na/50;
		na=money%50;
		$50원=mok;
		
		mok=na/10;
		na=money%10;
		$10원=mok;
		
		System.out.println("5만원권:"+$50000원);
		System.out.println("1만원권:"+$10000원);
		System.out.println("5천원권:"+$5000원);
		System.out.println("1천원권:"+$1000원);
		System.out.println("5백원권:"+$500원);
		System.out.println("1백원권:"+$100원);
		System.out.println("5십원권:"+$50원);
		System.out.println("10원권:"+$10원);
		System.out.println("10원 이하 절삭");
	}
}

