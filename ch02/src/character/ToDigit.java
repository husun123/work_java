package character;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int what = input.nextInt();
		System.out.printf("%o %d %h", what, what, what);
		// %h �� %x �� �Ѵ� 16������ ǥ���ϰ� ���̴� ����.
		input.close();
	}

}
