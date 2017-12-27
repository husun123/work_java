package Programming.chapter3;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("두 실수를 입력하시5.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double add = a + b;
		double avg = (a + b) /2;
		
		
		System.out.printf("합 : %.2f \n", add);
		System.out.printf("평균 : %.2f", avg);
	
		input.close();
	}

}
