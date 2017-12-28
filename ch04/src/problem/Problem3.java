package problem;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		String num = input.next();
		
		/*
		 * String.length() : 글자의 수 리턴
		 */
		/*for (int i = num.length() -1; i >= 0; i-- ) {
			char result = num.charAt(i);
			System.out.print(result);
		}*/
		int i = num.length() -1;
		do { 
			
			char result = num.charAt(i);
			System.out.print(result);
			i--;
		}while (i>=0);
		
		input.close();
		
	}
}
