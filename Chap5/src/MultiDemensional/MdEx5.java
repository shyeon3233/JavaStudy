package MultiDemensional;

public class MdEx5 {
	public static void main(String[] args) {
		int[][] m1 = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		int[][] m2 = {
				{ 7, 8 },
				{ 9, 10 },
				{ 11, 12 }
		};
		
		final int ROW = m1.length;
		final int COL = m2[0].length;
		final int M2_ROW = m2.length;
		
		int[][] m3 = new int[ROW][COL];
		
		for(int i=0; i < ROW; i++) {
			for(int j=0; j < COL; j++) {
				for(int k=0; k < M2_ROW; k++) {
					m3[i][j] += (m1[i][k] * m2[k][j]);
				}
				
			}
		}
		for(int[] i : m3) {
			for(int j : i) {
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
	}
}
