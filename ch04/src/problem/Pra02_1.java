package problem;

import java.util.Scanner;

public class Pra02_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("배열 크기 입력");
		int count = input.nextInt();

		char[][] array = new char[count][count];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(i >= j) {
					array[i][j] = '*';
				}
				else {
					array[i][j] = ' ';
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		input.close();
	}
}
