package Programming.chapter3;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��Ͻÿ�.");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double add = (int)a + (int)b;
		double ave = ((int)a + (int)b)/2;
		
		System.out.printf("�� : %.2f \n", add);
		System.out.printf("��� : %.2f", ave);

		input.close();
		
	}

}
