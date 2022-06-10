package ChapString;

public class StringEx3 {
	public static void main(String[] args) {
		System.out.println("전달받은 매개변수의 수는 : " + args.length);
		for(int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
