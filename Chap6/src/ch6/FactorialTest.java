package ch6;

import java.util.Scanner;

public class FactorialTest {
	public static void main(String[] args) {
		
		int n = inputData();
		System.out.println(factorial(n));
			
	}
	
	static int inputData() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		return n;
	}
	
	static int factorial(int n) {
		if(n <= 0 || n > 12) return -1;
		if(n == 1) return 1;
		else {
			return n * factorial(--n);
		}
	}
}
