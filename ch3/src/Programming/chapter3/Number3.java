package Programming.chapter3;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("무게을 입력하시오.");
		
		double a = input.nextDouble();
		double b = a*1000000/453592;
		
		System.out.printf("파운드 : %.3f", b);
		
		input.close();
	}

}
