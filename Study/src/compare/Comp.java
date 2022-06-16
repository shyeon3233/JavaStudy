package compare;

import java.util.Comparator;

public class Comp {
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Kim", 20);
		Person p2 = new Person(2, "Lee", 24);
		Person p3 = new Person(3, "Jeong", 22);
		
		if(p3.compare(p1, p2) == -1) System.out.println("p1은 p2보다 나이가 적습니다.");
		else if(p3.compare(p1, p2) == 1) System.out.println("p1은 p2보다 나이가 많습니다.");
		else System.out.println("p1은 p2랑 나이가 같습니다.");
	}
}

class Person implements Comparator<Person> {
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.age < p2.age) return -1;
		else if(p1.age > p2.age) return 1;
		return 0;
	}

}
