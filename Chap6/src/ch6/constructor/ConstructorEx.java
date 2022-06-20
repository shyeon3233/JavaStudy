package ch6.constructor;

class Data{
	int value;
	
	Data(){	// 인스턴스 생성 시 수행할 동작을 정의
		
	}
	
	Data(int val){ // 매개변수를 전달받을 수 있도록 오버로딩된 생성자
		this.value = val;
	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(5);
	}
}
