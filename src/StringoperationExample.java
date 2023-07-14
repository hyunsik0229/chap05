import java.net.MulticastSocket;

public class StringoperationExample {
	/*
	 * mutable 수정가능한데이터
	 * immutable 수정불가 데이터
	 */

	public static void main(String[] args) {
		String str = "자바 프로그래밍";

		
		String str2 = str.replace("자바", "JAVA");
		
		System.out.println(str2.toLowerCase());
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(3,5));
		
		System.out.println("   Hello   ");
		System.out.println("   Hello   ".trim());

	}

}
