package progamming.practice.ch06.num01;

public class Regular extends Employee{

	
	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public void setSalary(long salary) {
		super.setSalary(salary);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" 월급 : " + super.getSalary() + " -정규직-");
	}
	
	
	
}
