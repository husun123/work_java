package Programming.chapter3;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		int a = input.nextInt();
		
	
		if(a%400 == 0) {
			System.out.printf("%d���� �����Դϴ�.", a);
		}
		
		else if (a%4 == 0) {
			if (a%100 == 0)
				System.out.printf("%d���� ����Դϴ�.", a);
			
			else
			System.out.printf("%d���� �����Դϴ�.", a);
		}
		
		else 
			System.out.printf("%d���� ����Դϴ�.", a);
		
		input.close();
	}

}
