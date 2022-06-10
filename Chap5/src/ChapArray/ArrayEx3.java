package ChapArray;
import java.util.Arrays;

/* 배열을 복사하는 방법과 참조변수가 가리키는 주소를 변경하는 방법 */

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] copyArr1 = new int[5];
		
		for(int i = 0; i < copyArr1.length; i++) {
			copyArr1[i] = arr[i] + 10;
		}
		System.out.println(Arrays.toString(copyArr1));
		
		int[] copyArr2 = new int[5];
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		System.out.println(Arrays.toString(copyArr2));
		
		int[] chgArr = new int[] { 1, 3};
		int[] bigArr = new int[10];
		
		System.arraycopy(copyArr1, 0, bigArr, 0, copyArr1.length);

		System.out.println(Arrays.toString(bigArr));
		System.out.println(Arrays.toString(chgArr));
		
		chgArr = bigArr;
		System.out.println(Arrays.toString(chgArr));
		
	}
}
