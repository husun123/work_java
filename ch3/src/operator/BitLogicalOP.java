package operator;

public class BitLogicalOP {

	public static void main(String[] args) {
		int x = 4, y = 7;
		System.out.printf("%x & %8x -> %-8x %n", x, -1, x & -1);
		System.out.printf("%x & %8x -> %-8x %n", y, -1, y & -1);
		System.out.printf("%x | %-8x -> %-8x %n", x, 0, x | 0);
		System.out.printf("%x | %-8x -> %-8x %n", y, 0, y | 0);
		System.out.printf("(%x^1)^1 -> %1$-4d %n", x, (x^1)^1);
		System.out.printf("%1$-8x %1$-4d %n", (~x) + 1);
		System.out.printf("%1$-8x %1$-4d", (~y) + 1);
	}

}
