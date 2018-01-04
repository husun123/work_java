package circle.cylinder.practice;

public class Cylinder {

	public Circle circle;
	public double height;

	public double getVolume() {
																					// 원 넓이를 구한다.
		double volume = circle.getArea() * this.height;
		return volume;
	}
	
	public Cylinder() {
	}
	
	public Cylinder (Circle circle) {
		this.circle = circle;
	}
	
	public Cylinder(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		// 1. 원을 만든다.(Circle 클래스를 이용하여 객체를 생성한다.)
		Circle c1 = new Circle(2.8);
		// 2. 실린더를 만든다.(Cylinder 클래스를 이용하여 객체를 생성한다.)
		Cylinder cylinder = new Cylinder();
		cylinder.height(5.6);												//cylinder 객체의 circle 필드를 초기화
		cylinder.circle(c1);															//cylinder 객체의 height 필드를 초기화
		
		//3. 실린더의 부피를 구하는 메소드를 호출한 뒤, 리턴 값을 저장
		System.out.println(cylinder.getVolume());
				

	}

	private void circle(Circle c1) {
		// TODO Auto-generated method stub
		
	}

	private void height(double d) {
		// TODO Auto-generated method stub
		
		
	}
}
