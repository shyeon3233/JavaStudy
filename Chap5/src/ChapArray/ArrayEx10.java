package ChapArray;

import java.util.Arrays;

/* 랜덤값을 버블정렬을 이용해서 오름차순으로 정렬한다. */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for(int i=0; i < arr.length; i++) {	// 랜덤한 값으로 배열을 채운다.
			arr[i] = (int)(Math.random() * 10);
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i < (arr.length-1); i++) {	// 길이 - 1 만큼 비교를 진
			boolean changeFlag = false;
			
			for(int j=0; j < (arr.length-1-i); j++) {	// 정렬이 한번 끝날때 맨 뒷자리는 가장 큰 값이 자리하기 때문에 비교 횟수가 줄어든다.
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					changeFlag = true;
				}
			}
			if(!changeFlag)	// 반복횟수가 끝나기 전에 정렬이 끝날 수 있으므로 정렬이 끝났다면 반복문을 종료시켜준다.
				break;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
