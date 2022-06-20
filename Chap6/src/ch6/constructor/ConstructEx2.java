package ch6.constructor;

class Student{
	String name;
	int grade;
	String school;
	
	Student(){
		this("lee");
	}
	
	Student(String name){
		this(name, 1, "incheon");
	}
	
	Student(String name, int grade, String school){
		this.name = name;
		this.grade = grade;
		this.school = school;
	}
	
	Student(Student student){
		this.name = student.name;
		this.grade = student.grade;
		this.school = student.school;
	}
}

public class ConstructEx2 {
	public static void main(String[] args) {
 		Student s1 = new Student("kim", 3, "seoul"); // 인스턴스를 초기화하면서 생
		Student s2 = new Student(); // 인스턴스 생성 후 초기화를 하지 않아 수동으로 초기화를 지정
		Student s3 = new Student("jeong");
		Student s4 = new Student(s1);
	
		System.out.printf("s1의 이름 :  %s, 학년 : %d, 학교 : %s%n", s1.name, s1.grade, s1.school);
		System.out.printf("s2의 이름 :  %s, 학년 : %d, 학교 : %s%n", s2.name, s2.grade, s2.school);
		System.out.printf("s3의 이름 :  %s, 학년 : %d, 학교 : %s%n", s3.name, s3.grade, s3.school);
		System.out.printf("s4의 이름 :  %s, 학년 : %d, 학교 : %s%n", s4.name, s4.grade, s4.school);		
	}
}
