package array.basic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		//배열 선언과 생성을 분리
		int[] month;																		//int month[];
		double[] values;																	//double values[]
		
		//배열생성
		month = new int[4];															
		values = new double[3];														
		System.out.println(month.length);											//month의 배열 크기 출력
		System.out.println(values.length);											//values의 배열 크기 출력
		
		//값 입력
		month[0] = 10;																	//month의 0번째에 10을 입력
	
		System.out.println(month);
		
		
		//배열 선언과 생성을 하나의 문장으로
		char[] ch = new char[6];
		float[] data = new float[5];
		data = new float[7];															//다른 배열 객체를 생성하여 저장
		System.out.println(ch.length);													//ch의 배열 크기 출력
		System.out.println(data.length);												//data의 배열 크기 출력
		
		//정적 배열
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks.length);											//String의 배열 크기 출력
		
	}

}
