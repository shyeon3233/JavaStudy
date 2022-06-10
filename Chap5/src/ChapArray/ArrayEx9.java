package ChapArray;

import java.util.Arrays;

/* 임의의 값으로 배열의 요소를 채우는 방법 */

public class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = {-4, -5, 0, 3, 2};
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) { // 무작위로 code 배열의 요소를 선택하여 arr 배열에 삽입
			int n = (int)(Math.random() * code.length);
			arr[i] = code[n];
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
