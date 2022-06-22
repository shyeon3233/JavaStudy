package ch6.initializationblock;

class Document{
	static int count = 0;	// 생성된 인스턴스들의 총합
	String name;			// 인스턴스 고유 이름
	
	Document(){
		this("제목없음" + (++count));
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다. ");
	}
	
}
class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("자바.txt");
		Document d4 = new Document();
	}
}