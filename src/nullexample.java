
public class nullexample {
	
	public static void main(String[] args) {
		int num = 100/0;
		
		System.out.println(num);
		
		System.out.println("end");
	}

	public static void main2(String[] args) {
		
		String str1 = "Hellp";
		String str2 = "hi";
		String str3 =null;
		//double num = null; 안됨
		
		
		str3 = "world";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
		System.out.println("end");
	}

}
