package variable;

public class Main {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		Card c4 = new Card();
		int width = 50;
		int height = 175;
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		c1.kind = "Heart";
		c2.kind = "Diamond";
		c3.kind = "Space";
		c4.kind = "Clover";
		c1.number = (int)(Math.random() * 13);
		c2.number = (int)(Math.random() * 13);
		c3.number = (int)(Math.random() * 13);
		c4.number = (int)(Math.random() * 13);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	
		Card.width = width;
		Card.height = height;
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
	}
}

class Card{
	static int width = 100;		// 클래스 변수
	static int height = 250;	// 클래스 변수
	String kind;	// 인스턴트 변수
	int number;		// 인스턴트 변수
	
	@Override
	public String toString() {
		return String.format("카드 : %s, 숫자 : %d, 가로 : %d, 세로 : %d %n", kind, number, width, height);
	}
}
