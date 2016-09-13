package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		goods[] arr = new goods[3];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("상품명 입력");
			String name = input.next();
			System.out.println("가격입력");
			int price = input.nextInt();
			System.out.println("수량 입력");
			int stock = input.nextInt();

			arr[i] = new goods(name, price, stock);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i].name + "(가격 : " + arr[i].price + "원)이 " + arr[i].stock + " 개 입고되었습니다.");
		}

	}

}

class goods {
	String name;
	int price;
	int stock;

	public goods(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

}
