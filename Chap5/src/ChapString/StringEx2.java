package ChapString;

public class StringEx2 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.print("src.charAt(" + i + ") : " + ch + "\n");
		}
		
		char chArr[] = src.toCharArray();
		
		System.out.println(chArr);
		
	}
}
