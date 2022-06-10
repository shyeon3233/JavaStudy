package ChapArray;

/* 배열 요소의 총합과 평균값을 구하는 방법 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0;
		
		int[] score = {100, 80, 70, 90, 95};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
			
	}
}
