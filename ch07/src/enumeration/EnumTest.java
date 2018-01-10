package enumeration;

public class EnumTest {

	public enum P1 {c, cpp, java, csharp};
	
	public static void main(String[] args) {
		P1 clang = P1.c;							// 정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang.toString());				// 저장된 상수 문자열이 출력

		clang = P1.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + ": C# 언어 ");
		}
		
		// for-each문
		for ( P1 p : P1.values())
			System.out.print(p + " ");
		System.out.println();
	}

}
