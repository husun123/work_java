package programming.pratice;

import java.util.Calendar;
import java.util.Scanner;

	// 표준 입력으로 년, 월, 일을 입력 받아 요일을 출력하는 프로그램을 작성하시오.
public class Practice04 {
	
	public Practice04() {
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("년, 월, 일을 입력하시오");
		String y = input.next();
		Calendar x = Calendar.getInstance();
		System.out.println(y);
		System.out.println(x);
	}

}
