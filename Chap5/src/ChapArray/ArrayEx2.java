package ChapArray;
import java.util.Arrays;

/* 다양한 배열의 초기화 방법과 출력 방법 */

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		int[] arr4 = {1, 2, 3, 4, 5};
		
		char[] cArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < 5; i++) {
			arr1[i] = i * 10;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr2.length * i;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println("");
		
		System.out.println(Arrays.toString(arr2));
		
		String str = Arrays.toString(arr3);	// String 형태의 값으로 변형된다.
		System.out.println(str);
		
		System.out.println(arr4);		// 참조변수가 가리키는 배열의 주소 출
		System.out.println(cArr);		// char형의 배열은 요소가 정상적으로 출력된다. 
		
		
	}
}
