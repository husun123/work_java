package problem;

import java.util.Scanner;

public class Pra02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*System.out.print("배열 크기 입력");
		int a = input.nextInt();

		int get[] = new int[a];

		for(int i = 1; i <= get.length; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}*/

		//표준 입력 받기
		System.out.println("배열 크기 입력");
		int count = input.nextInt();

		//배열 선언 및 초기화
		char[][] array = new char[count][];

		//래기드 배열 만들기
		for (int i = 0; i < array.length; i++) {
			array[i] = new char[i + 1];
		}

		//별을 배열에 저장
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = '*';
			}
		}

		//배열에 있는 별을 끄집어 내어 출력
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		input.close();

	}

}
