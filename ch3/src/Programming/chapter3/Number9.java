package Programming.chapter3;

import java.util.Scanner;

public class Number9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� �Է��Ͻÿ�.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double n = (a-100)*0.9;
		
		if (b <= n) {
			System.out.println("�����Դϴ�.");
		}
		else 
			System.out.println("���Դϴ�.");
		
		input.close();

	}

}
