package problem08;

public class Calculator {
	
	public double x, y;
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Calculator r1 = new Calculator();
		
				
		System.out.println(r1.add(3.4, 6.7));

	}

}
