package progamming.practice.ch06.num01;

public class TestDrive {

	public static void main(String[] args) {
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
		
		Employee l = new Regular("이순신", 35, "서울", "인사부");
		Employee j = new Temporary("장보고", 25, "인천", "경리부");
		l.setSalary(5000000);
		l.printInfo();
		//j.setWorkHours(120);
		j.printInfo();
		
	}

}
