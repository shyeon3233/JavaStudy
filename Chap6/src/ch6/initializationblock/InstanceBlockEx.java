package ch6.initializationblock;


class Car{
	
	static int num = 0;
	String color;
	String serialNo;
	String gearType;
	
	{ // 공통으로 수행되어야 하는 작없
		serialNo = "T-800" + num++;
	}
	
	Car(){
		this("white", "Auto");
	}
	Car(String color, String gearType){ // 인스턴스 변수를 초기화하는 작없
		this.color = color;
		this.gearType = gearType; 
	}
	
	public String toString() {
		return String.format("Color : %s%nGearType : %s%nSerialNo : %s", color, gearType, serialNo);

	}
}
class InstanceBlockEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("red", "Manual");
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
	}
}
