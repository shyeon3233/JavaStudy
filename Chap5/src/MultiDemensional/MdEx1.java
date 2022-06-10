package MultiDemensional;

public class MdEx1 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 200, 300},
				{10, 20, 30},
				{50, 60, 70},
				{40, 80, 90}
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
			}
		}
		
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
	}
}
