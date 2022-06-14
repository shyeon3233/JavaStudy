package ch6;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; };
	void channelUp() { ++channel; };
	void channelDown() { --channel; };
	void color(String color) { this.color = color; };
	
}

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr1 = new Tv[10];
		Tv[] tvArr2 = new Tv[] {new Tv(), new Tv(), new Tv()};
		Tv[] tvArr3 = {new Tv(), new Tv(), new Tv(), new Tv()};
		
		for(int i=0; i < tvArr1.length; i++) {
			tvArr1[i] = new Tv();
		}
		
	}

}
