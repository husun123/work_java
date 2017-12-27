package Programming.chapter3;

import java.util.Scanner;

public class Number8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("가장 큰 수 : " + result);
		
		input.close();
	}

}
