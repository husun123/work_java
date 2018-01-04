package programming.practice;

public class SalaryMan {

	public int salary = 1000000;

	public SalaryMan() {
	}

	public SalaryMan(int salary) {
		this.salary = salary;
	}

	public	int getAnnualGross() {
		return (this.salary * 12) + (this.salary * 5);
	}

	public static void main(String[] args) {

		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
 
	}
}
