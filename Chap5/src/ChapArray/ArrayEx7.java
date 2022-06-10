package ChapArray;

import java.util.Arrays;

/* 배열의 요소를 랜던하게 뒤섞는 방법 */
public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		 
	}
}
