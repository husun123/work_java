package problem;



public class Qwerasdf {

	/*
	 * 3. 1번문제 반대로 (배열 없이)
			2 * 1 = 2    3 * 1 = 3    4 * 1 = 4    ...    9 * 1 = 9
			2 * 2 = 4    3 * 2 = 6    4 * 2 = 8    ...    9 * 2 = 18

			.
			.
			.


			2 * 9 = 18    3 * 9 = 27    4 * 9 = 36    ...    9 * 9 = 81
	 */

	public static void main(String[] args) {

		for(int i = 1; i <=9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}

	}
}
