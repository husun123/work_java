package progamming.practice.ch06.num01;

public class Temporary extends Employee{

	private	int workHours;
	private int pay = 10000;
	
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	@Override
	public void setWorkHours(int workHours) {
		super.setSalary(this.workHours * this.pay);
		this.workHours = workHours;
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" 급여 : " + this.getSalary() + ", 일한 시간 : " + this.workHours + " -비정규직-");
	}
	
	public static void main(String[] args) {
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
		
		Employee e = new Regular("이순신", 35, "서울", "인사부");
		Employee p = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
	}
}


