package Programming.chapter3;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("연도를 입력하시오");
		int a = input.nextInt();
		
	
		if(a%400 == 0) {
			System.out.printf("%d년은 윤년입니다.", a);
		}
		
		else if (a%4 == 0) {
			if (a%100 == 0)
				System.out.printf("%d년은 평년입니다.", a);
			
			else
			System.out.printf("%d년은 윤년입니다.", a);
		}
		
		else 
			System.out.printf("%d년은 평년입니다.", a);
		
		input.close();
	}

}
