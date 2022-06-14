package ch6;

//class Tv{
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() { power = !power; };
//	void channelUp() { ++channel; };
//	void channelDown() { --channel; };
//	void color(String color) { this.color = color; };
//	
//}
public class TvTest2 {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2.channel = 5;
		
		System.out.println("t1 channel : " + t1.channel);
		System.out.println("t2 channel : " + t2.channel);
		System.out.println("t1 color : " + t1.color);
		System.out.println("t2 color : " + t2.color);
		
		t1.channelDown();
		t2.channelUp();
		t1.color("Blue");
		t2.color("Red");
		
		System.out.println("t1 channel : " + t1.channel);
		System.out.println("t2 channel : " + t2.channel);
		System.out.println("t1 color : " + t1.color);
		System.out.println("t2 color : " + t2.color);
		
		
	}
}
