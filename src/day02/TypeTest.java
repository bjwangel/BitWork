package day02;

public class TypeTest {

	public static void main(String[] args) {
		// implicity(암시적) type casting
		int i= 10;
		long l= i;
		
		System.out.println(i+":"+l);
		
		
		// explicity(명시적) type casting
		long l2=1234567891;
		int i2=(int)l2;
		
		System.out.println(i2);
	}

}
