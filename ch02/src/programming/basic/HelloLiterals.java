package programming.basic;

public class HelloLiterals {
	static long creditCardNumber = 1234_5678_9012_3456L;			//Java 7บฮลอ ภ๛ฟ๋
	static long socialSecurityNumber = 999_99_9999L;
	static float pi = 3.14_15F;

	public static void main(String[] args) {
		System.out.println(0b1010);
		System.out.println(016);
		System.out.println(0x1F);
		System.out.println(3.14F);
		System.out.println(3.1415D);
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
	}

}
