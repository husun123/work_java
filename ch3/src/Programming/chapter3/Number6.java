package Programming.chapter3;

import java.util.Scanner;

public class Number6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int b = a / 10000;
		
		
		int c = a % 10000 / 1000;
		
				
		int d = a % 1000 / 100;
		
		
		int e = a % 100 / 10;
		
		
		int f = a % 10;
		
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다.", b, c, d, e, f);
		
		input.close();
	}

}
 