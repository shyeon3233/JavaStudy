package ch6.initializationblock;
class Product{
	static int count = 0;	// 생성된 인스턴스들의 수를 자징
	int serialNo;			// 생성된 각각의 인스턴스 고유 번호

	{
		++count;			// 인스턴스 공통의 값
		serialNo = count;	// 인스턴스 별 고유의 값 
	}
	
	public Product() {}		// 생략 가능
}
class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.printf("생산된 제품의 수는 %d개 입니다.", Product.count);
	}
}
