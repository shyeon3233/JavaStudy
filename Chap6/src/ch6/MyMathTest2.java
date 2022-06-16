package ch6;

class MyMath2{
	long a, b;
	
	long add() { return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	static long add(long a, long b) { return a + b; }
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(double a, double b) { return a / b; }
}
public class MyMathTest2 {
	public static void main(String[] args) {
		
		MyMath2.add(400L, 200L);
		MyMath2.subtract(400L, 200L);
		MyMath2.multiply(400L, 200L);
		MyMath2.divide(500L, 200L);
		
		MyMath2 mm = new MyMath2();
		mm.a = 700L;
		mm.b = 400L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
	}
}
