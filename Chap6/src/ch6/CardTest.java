package ch6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		String[] shape = new String[] { "Space", "Heart", "Diamond", "clover" };
		Card[][] card = new Card[4][13];
		
		CreateCard(card, shape);
		PlayingCard.Suffle(card);
		PrintCard(card);
		ChangeSize();
		PrintCard(card);
	}
	static void CreateCard(Card[][] card, String[] shape){
		for(int i=0; i < card.length; i++) {
			for(int j=0; j < card[i].length; j++) {
				card[i][j] = new PlayingCard(shape[i], j);	
			}
		}
	}
	static void PrintCard(Card[][] card) {
		for(int i=0; i < card.length; i++) {
			for(int j=0; j < card[i].length; j++) {
				System.out.println(card[i][j].toString());
			}
		}
	}
	static void ChangeSize() {
		Card.width = 50;
		Card.height = 175;
	}
}

class Card{
	static int width = 100;
	static int height = 250;
}

class PlayingCard extends Card{
	String kind;
	int num;
	
	public PlayingCard(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.format("카드 : %s, 숫자 : %d, 가로 : %d, 세로 : %d %n", kind, num, width, height);
	}
	public static void Suffle(Card[][] card) {
		for(int i=0; i < card.length; i++) {
			for(int j=0; j < card[i].length; j++) {
				int first = (int)(Math.random() * 4);
				int second = (int)(Math.random() * 13);
				Card tmp = card[i][j];
				card[i][j] = card[first][second];
				card[first][second] = tmp;
			}
		}
	}
}