package progamming.practice.ch06.num01;

public class Temporary extends Employee{

	public int workHours;
	public int pay = 10000;
	
	public void setWorkHours(int workHours) {
		this.pay = pay * workHours;
		this.workHours = workHours;
	}
	
	public int getWorkHours() {
		return workHours;
	}



	public Temporary() {
	}

	
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public void printInfo() {
		System.out.print("이름 : " + super.getName() + ", 나이 : " +super.getAge() + ", 주소 : " + super.address + ", 부서 : " + super.getDepartment() );
		System.out.println(" 급여 : " + this.pay + ", 일한 시간 : " + workHours + " -비정규직-");
	}

	
	}

