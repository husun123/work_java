package programming.basic;

public class PrintfTest {

	public static void main(String[] args) {
		
		// 6-1
		System.out.printf("%d %f %s", 10, 3.7854, "Á¤¼ö"); 
		
		// 6-2
		int year = 2014;
		double amount = 1_000_000;
		System.out.format("%1$d %2$f %2$8f %1$d", year, amount);
	}

}
