package Programming.chapter3;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("화씨를 섭씨로 바꾸시려면 [F], 섭씨를 화씨로 바꾸시려면 [C]를 입력하시오.");
		
		String a = input.next();
		System.out.println("온도를 입력하시오.");
		double b = input.nextDouble();
		double x = (5.0 / 9.0)*(b-32);
		double y = (9.0 / 5.0)*b+32;
		
		
		switch (a) {
			case  "F" : case "f" : 
				System.out.printf("섭씨는 %.2f 입니다.", x);
				break;
			case "C" : case "c" :
				System.out.printf("화씨는 %.2f 입니다.", y);
				break;
		}
		input.close();
	}

}
