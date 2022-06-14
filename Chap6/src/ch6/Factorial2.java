package ch6;

public class Factorial2 {
	public static void main(String[] args) {
		
		int n = 21;
		long result = 0L;
		
		for(int i=1; i <= n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다.(0 <= n < 20) : %d %n", n);
				break;
			}
			System.out.printf("%2d! = %20d%n",i, result);		
		}
		
	}
	
	static long factorial(int n) {
		if(n <= 0 || n > 20) return -1;
		else if(n == 1) return 1;
		else return n * factorial(--n);
	}
}