package day01;

public class VariableTest {

	public static void main(String[] args) {
		int i= 10;
		long l= 90;
		byte b= 20;
		float f=3.14f;
		double d=3.14;
		boolean b2= true;
		short s=100;
		char c='a';
		String str="hello world";
		
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(str);
		System.out.println(b2);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		
		
		// 레퍼런스 타입 (참조형)
		Circle circle=new Circle();
		
		circle.radius=5;
		circle.area=(circle.radius)*(circle.radius)*3.14;
		
		// char type
		char ch1='A';
		char ch2=65;
//		int i2=1;
		
		System.out.println(ch1+""+ch2);
		
		String s1="hello";
		String s2="world";
		
		System.out.println(s1+" "+s2);
	}

}
