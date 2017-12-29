package problem;

public class Problem8 {

	public static void main(String[] args) {
		int[][] array = {
				{78, 48, 78, 98},
				{99, 92},
				{29, 64, 83},
				{34,78, 92, 56}
			};
			//2차원 배열을 탐색하기 위해서 이중 for 문 작성
			for ( int i = 0, sum = 0; i < array.length; i++){
				for(int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
					sum += array[i][j];
				}
			System.out.printf("행의 합 : %d, 평균 : %d\n", sum, sum / array[i].length);	
			sum = 0;
			}
			
			

	}

}
