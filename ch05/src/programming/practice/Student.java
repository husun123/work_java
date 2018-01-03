package programming.practice;

public class Student {
	
	private String major;
	private int number;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Student a = new Student();
		a.setMajor("목탁디자인과");
		a.setNumber(123456789);

		System.out.println(a.getMajor());
		System.out.println(a.getNumber());
	}

}
