package ch6;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.Add(5L, 3L);
		long result2 = mm.Subtract(5L, 3L);
		long result3 = mm.Multiply(5L, 3L);
		double result4 = mm.Divide(5L, 3L);	// 매개변수로 전달되는 숫자값의 경우 자동형변환이 이루어지므로, double 형으로 자동 형변환 된다.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}

class MyMath{
	long Add(long a, long b) { return a + b; }
	long Subtract(long a, long b) { return a - b; }
	long Multiply(long a, long b) { return a * b; }
	double Divide(double a, double b) { return a / b; }
	
}
