package programming.basic;

public class Hellochars {

	public static void main(String[] args) {
		System.out.println('a');			//char ��
		System.out.println('\\');		// \���
		
		// 8���� 142�� ASCII �ڵ� �� (10���� 98�� ASCII �ڵ尪)
		System.out.println('\142');
		
		System.out.println('\uAC00');		// UTF-8 (unicode) �� AC00 : ��
		System.out.println('\uAC01');		// UTF-8 (unicode) �� AC01 : ��
		System.out.println('��');
	}

}
