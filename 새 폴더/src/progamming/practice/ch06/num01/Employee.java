package progamming.practice.ch06.num01;

public abstract class Employee {

	private String name;
	private int age;
	private String address;
	private String department;
	private long salary;

	public Employee() {
	}


	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}	

	
	public void printInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 주소 : " + this.address + ", 부서 : " + this.department );
	}
	
	public Employee(String name, int age, String address ,String department) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	public void setWorkHours(int workHours) {
		
	}



}
