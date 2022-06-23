package ch6.initializationblock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StaticBlockEx{
	static String str;
	static int num;
    static{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
			str = br.readLine();
			if(str.isEmpty()) {
				throw new IOException("아무런 값이 없습니당");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    {
    	num = 0;	
    }
	public static void main(String[] args){
		System.out.println(str);
		System.out.println(num);
    }
}