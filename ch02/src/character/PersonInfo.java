package character;

import java.util.Scanner;

public class PersonInfo {

	static int weight;
	static double height;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		weight = scan.nextInt();
		height = scan.nextDouble();
		System.out.print("������ : " + weight + " Ű : " + height);
		
		scan.close();		
	}

}
