package ch6;

public class CallStackTest {
	public static void main(String[] args) {
		FirstStack(); // FirstStack 메소드가 메모리 공간을 스택에 할당는다. 
		System.out.println("mainStack");
	}
	
	static void FirstStack() {
		SecondStack();
		System.out.println("FirstStack");
	}
	static void SecondStack() {
		System.out.println("SecondStack");
	}
}

/*
 * 1) FirstStack 메소드 호출
 * 
 * |			|
 * |			|
 * |			|
 * |			|
 * |FirstStack	|
 * |main		|
 * --------------
 * 2) SecondStack 메소드 호출 
 * 
 * |			|
 * |			|
 * |			|
 * |SecondStack	| -> 출력 값 SecondStack
 * |FirstStack	|
 * |main		|
 * --------------
 * 3) SecondStack 종료 
 * 
 * |			|
 * |			|
 * |			|
 * |			| 
 * |FirstStack	| -> 출력 값 FirstStack
 * |main		|
 * --------------
 * 4) FirstStack 종료 
 * 
 * |			|
 * |			|
 * |			|
 * |			|
 * |			|
 * |main		| -> 출력 값 mainStack
 * --------------
 * 5) main 종료 
 * 
 * |			|
 * |			|
 * |			|
 * |			|
 * |			|
 * |			| 
 * --------------
*/

