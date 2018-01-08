package progamming.practice.ch06.num01;

public class Complex {

	private double a;				// 실수부
	private double b;				// 허수부
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public static Complex add(Complex c1, Complex c2) {
		Complex c = new Complex(c1.a + c2.a, c2.b + c2.b);
			return c;
	}
	
	public static Complex sub(Complex c1, Complex c2) {
		Complex c = new Complex(c1.a -c2.a, c2.b - c2.b);
			return c;
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}
	
	public String print() {
		return this.a + " + " + this.b + "i";
	}
	
	public static void main(String[] args) {
		Complex x = new Complex(3.4, 4.5);
		Complex y  = new Complex(5.2, -2.4);
		
		Complex res1 = Complex.add(x, y);
		Complex res2 = Complex.sub(x, y);
		
		System.out.println("더한 결과 : " + res1.print());
		System.out.println("뺀 결과 : " + res2.print());
		
		System.out.println("x의 절대값 : " + x.abs());
		System.out.println("y의 절대값 : " + y.abs());
	}
}