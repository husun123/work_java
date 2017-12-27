package character;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int what = input.nextInt();
		System.out.printf("%o %d %h", what, what, what);
		// %h 와 %x 는 둘다 16진수를 표현하고 차이는 없다.
		input.close();
	}

}
