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

public class TvTest3 {
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
		
		
		t2 = t1;	// 	t1이 가리키던 주소를 t2에게 전달한다. 기존의 t2에 저장되어 있던 객체(인스턴스)는 사용할 수 없어진다.
		
		System.out.println("t1 channel : " + t1.channel);
		System.out.println("t2 channel : " + t2.channel);
		System.out.println("t1 color : " + t1.color);
		System.out.println("t2 color : " + t2.color);
		System.out.println(t1);	// 같은 객체를 바라보고 있는 것을 확인할 수 있다. 
		System.out.println(t2);
		
	}
}
