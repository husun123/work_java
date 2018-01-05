package progamming.practice.ch06.num01;

public class Regular extends Employee{

	
	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	

	
	
	
	public void printInfo() {
		System.out.print("이름 : " + super.getName() + ", 나이 : " +super.getAge() + ", 주소 : " + super.address + ", 부서 : " + super.getDepartment() );
		System.out.println(" 월급 : " + this.getSalary() + " -정규직-");
	}
	
	
	
}
