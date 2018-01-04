package inheritance.comstructor;

public class Motor extends Vehicle{

	public String name = "자동차";
	public int displacement;
	
	// 기본 생성자
	public Motor() {
		super();				// Vehicle(); 생략 가능(컴파일러가 자동으로 생성)
	}
	
	// 생성자
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		//this.maxSpeed = maxSpeed;
		//this.seater = seater;
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.print(super.name + " : " + this.name );
		System.out.println(", 최대속도 : " +  maxSpeed + " km");
		System.out.print("정원 : " + seater + "명");
		System.out.println(", 배기량 : " + displacement + " cc");
	}
	
	public static void main(String[] args) {
		Motor myCar = new Motor(300, 4, 5000);
		myCar.printInfo();

	}

}
