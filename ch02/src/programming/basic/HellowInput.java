package programming.basic;

public class HellowInput {

	public static void main(String[] args) {
		// System.in�� Ű������ �Է½�Ʈ��
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("�̸��� �й��� �Է��ϼ���.");
		
		// �Է¹��� ���ڿ��� ��ū(����)���� ������� ���ڿ� �Ϻθ� ����
		String name = input.next();		
		String second = input.next();
		int num = input.nextInt();
		System.out.println("�̸� : " + name + second + ", �й� : " + num);
				
	}

}
