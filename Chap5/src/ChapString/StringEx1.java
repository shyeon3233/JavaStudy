package ChapString;

public class StringEx1 {

	public static void main(String[] args) {
		String[] name = new String[] { "kwang", "park", "jang" };	// 참조형 변수에 따라 null로 초기화 된다. 
		
		for(int i=0; i < name.length; i++) {
			System.out.println(name[i]);
			System.out.print(name[i]);
		}
		System.out.println(name);
		

		name[0] = "kim";
		name[1] = "jeong";
		name[2] = "lee";
		
		System.out.print(name[0]);
		System.out.print(name[1]);
		System.out.print(name[2]);

		for(String i : name) {
			System.out.println(i);
		}
		System.out.println(name);
	}
}
