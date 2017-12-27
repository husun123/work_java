package array.basic;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//배열 선언
		double[] points = new double[3];
		
		points[0] = 28;					//첨자가 0에서 3까지 유효
		points[1] = 29;
		points[2] = 30;
		//points[3] = 31;					//실행 시 오류 발생
		
		System.out.println(points.length);			//points의 배열 크기 출력
		System.out.println(points[0]);				//points[]0의 배열 원소 출력
		System.out.println(points[1]);				//points[]1의 배열 원소 출력
		System.out.println(points[2]);				//points[]2의 배열 원소 출력
		//System.out.println(points[3]);

	}

}
