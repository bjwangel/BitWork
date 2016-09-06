package day02;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2003;

		if (year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else if (year % 100 != 0) {
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
