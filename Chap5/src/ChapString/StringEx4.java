package ChapString;

public class StringEx4 {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Usage : NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = 0;
		int num2 = 0;
		char op = args[1].charAt(0);
		int result = 0;
		
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[2]);			
		}catch(NumberFormatException e) {
			System.out.println("Warring : input Number");
		}
		
		
		switch(op) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
		}
		System.out.println("result : " + result);
	}
}
