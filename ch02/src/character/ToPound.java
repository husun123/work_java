package character;

import java.util.Scanner;

public class ToPound {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double what = input.nextDouble();
		System.out.println("���� : " + what);
		System.out.println("����" + what*2.2);
		
		input.close();
		}

}
