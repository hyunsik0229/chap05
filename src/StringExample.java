
public class StringExample {

	public static void main(String[] args) {
		int num = 10;
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = str3;
		
		str1 = "hi";
		str2 = "world";
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		System.out.println(str1.equals(str3));

	}

}
