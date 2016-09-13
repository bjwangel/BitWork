package prob6;

public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		int size=c.length;
		char c2[]=new char[size];
		
		replaceSpace(c,c2);   // 공백 문자 바꾸기
		printCharArray(c,c2); // 수정된 배열 원소 출력
	}

	static void replaceSpace( char a[],char b[] ) {
		for(int i=0;i<a.length;i++){
			if(a[i]==' '){
				b[i]=',';
			}else{
				b[i]=a[i];
			}
		}
	}

	static void printCharArray( char a[],char b[] ) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}System.out.println("");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
	}
}
