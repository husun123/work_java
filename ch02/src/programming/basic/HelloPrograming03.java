package programming.basic;

public class HelloPrograming03 {
	
	// 1�� �ּ�
	// �ȳ��ϼ��� �ݰ����ϴ�
	
	//������ �Է��ϴ� �ּ�
	/* ��
	   ��
	   ��
	   �� */
	
	// JavaDoc�ּ�
	/**
	 
	@author KOITT 
	 */
	   
	 // �ּ� ����Ű Ctrl + Shift + / , Ctrl + Shift + \ 
	
	static String hello = "�ȳ��ϼ���. ������ - �ݰ����ϴ�.";
	static String hello02 = "Hello";
	
	public static void main(String[] args) {
		
		String hello2 = "Hello! Everyone!";
		String hello3 = "Everyone!";
		
		print10(hello3);
		
		printSum(10, 20);
		
		print10(hello2);
		
		printSum(50, 30);
		
		printSum(20, 70);
		
		printSum(100, 30);
		
		print10(hello3);
	
	}
	
	// ���� ���� 10�� ����ϴ� �޼ҵ�
	static void print10(String word) {
		for (int i = 0; i < 10; i++) {
			System.out.println(word);
		}
	}
	
	// �� ���� ���� ����ϴ� �޼ҵ�
	static void printSum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
}