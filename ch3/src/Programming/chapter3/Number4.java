package Programming.chapter3;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ȭ���� ������ �ٲٽ÷��� [F], ������ ȭ���� �ٲٽ÷��� [C]�� �Է��Ͻÿ�.");
		
		String a = input.next();
		System.out.println("�µ��� �Է��Ͻÿ�.");
		double b = input.nextDouble();
		double x = (5.0 / 9.0)*(b-32);
		double y = (9.0 / 5.0)*b+32;
		
		
		switch (a) {
			case  "F" : case "f" : 
				System.out.printf("������ %.2f �Դϴ�.", x);
				break;
			case "C" : case "c" :
				System.out.printf("ȭ���� %.2f �Դϴ�.", y);
				break;
		}
		input.close();
	}

}
