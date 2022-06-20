package ch6;

public class OverloadEx1 {
	public static void main(String[] args) {
		int a=3, b=4, c=8, d=9, e=7, f=2;
		
		int result = add(a, new int[] {1,2}); // 호출할 메소드 구분이 가능
		System.out.println(result);
	}
	
	// 가변인자 오버로딩
	static int add(int a, int... args) {
		int result = a;
		for(int i=0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
	
	static int add(int... args) {
		int result = 0;
		for(int i=0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
}

