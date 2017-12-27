package Programming.chapter3;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("두 실수를 입력하시오.");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double add = (int)a + (int)b;
		double ave = ((int)a + (int)b)/2;
		
		System.out.printf("합 : %.2f \n", add);
		System.out.printf("평균 : %.2f", ave);

		input.close();
		
	}

}
