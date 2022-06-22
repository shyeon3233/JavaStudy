package ch6.initializationblock;

public class StaticBlockTest {

	static int[] arr = new int[10];
	
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] =(int)(Math.random() * arr.length) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d%n", i, arr[i]);
		}
	}
}
