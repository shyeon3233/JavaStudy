package ch6;

public class ReferenceParam {
	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 8, 6, 9, 4, 7, 5};
		
		printArr(arr);// 배열 요소 출력
		sortArr(arr);// 배열 정렬
		printArr(arr);// 정렬된 요소 출력
		System.out.printf("sum : %d %n", sumArr(arr));// 배열의 합을 출력
		
	}
	static void printArr(int[] arr) {
		System.out.print("[ ");
		for(int i : arr) {
			System.out.printf("%d, ", i);
		}
		System.out.print(" ]\n");
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i < arr.length-1; i++) {
			for(int j=0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) 
			sum += arr[i];
		
		return sum;
	}
}
