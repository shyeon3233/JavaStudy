package MultiDemensional;

import java.util.Arrays;
import java.util.Scanner;

public class MdEx4 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] board = new int[5][5];
		int x = 0, y = 0, num = 0;
		
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				board[i][j] = i * SIZE + j + 1;
			}
		}
		
		for(int i=0; i < SIZE; i++) {
			for(int j=0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				int tmp = board[i][j];
				board[i][j] = board[x][y];
				board[x][y] = tmp;
				
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			for(int[] i : board) {
				for(int j : i) {
					System.out.printf("%3d", j);					
				}
				System.out.println();
			}
			
			System.out.printf("1~%d 사이의 숫자를 입력하세요.(종료:0) < ", (SIZE*SIZE));
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num == 0) {
				System.out.println("종료합니다....");
				System.exit(0);
			}
			outer:
			for(int i=0; i < SIZE; i++) {
				for(int j=0; j < SIZE; j++) {
					if(board[i][j] == num) {
						board[i][j] = 0;
						break outer;
					}
				}
			}
			
		}
		
		
		
	}
}
