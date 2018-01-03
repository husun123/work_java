package problem08;

public class Professor {

	public String dept;
	public int uNumber;
	
	public Professor(int uNumber) {
		this.uNumber = uNumber;
	}
	
	public Professor(String dept) {
		this.dept = dept;
	}
	
	public Professor(String dept, int uNumber) {
		this(dept);
		this.uNumber = uNumber;
	}
	
	public static void main(String[] args) {
		

	}

}
