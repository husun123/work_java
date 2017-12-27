package programming.basic;

public class HelloPrograming02 {
	
	// 전역 변수
	// 멤버변수
	static String hello = "안녕하세요. 여러분 - 반갑습니다";

	public static void main(String[] args) {
		
		// 지역 변수
		String hello2 = "Hello Everyone";
		
		System.out.println(hello2);
		print9(hello);	

	}
	
	static void print9(String val) {
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);
		System.out.println(hello);	
		
	}

}
