package character;

import java.util.Scanner;

public class ToPound {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double what = input.nextDouble();
		System.out.println("무게 : " + what);
		System.out.println("무게" + what*2.2);
		
		input.close();
		}

}
