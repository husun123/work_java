package progamming.practice.ch06.num01;

public class Employee {

	private String name;
	private int age;
	String address;
	private String department;
	private int salary;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + getName() + ", 나이 : " + getAge() + ", 주소 : " + address + ", 부서 : " + department );
	}
	
	public Employee(String name, int age, String address ,String department) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}



}
