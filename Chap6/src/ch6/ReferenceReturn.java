package ch6;

class Data{	int x; }
	
public class ReferenceReturn {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 100;
		System.out.println(d1.x);
		
		Data d2 = copyData(d1);
		System.out.println(d2.x);
		
		System.out.println(d1 + " " + d2);
	}
	
	static Data copyData(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}