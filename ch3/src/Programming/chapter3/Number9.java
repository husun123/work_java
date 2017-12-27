package Programming.chapter3;

import java.util.Scanner;

public class Number9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력하시오.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double n = (a-100)*0.9;
		
		if (b <= n) {
			System.out.println("정상입니다.");
		}
		else 
			System.out.println("비만입니다.");
		
		input.close();

	}

}
