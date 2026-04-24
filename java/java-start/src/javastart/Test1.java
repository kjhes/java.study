package javastart;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	void checkAdult() {
		if (age >= 19) {
			System.out.println("성인");
		}
		else if (age >= 10) {
			System.out.println("청소년");
		}
		else if (age < 10) {
			System.out.println("소인");
		}
	}
}




public class Test1 {

	public static void main(String[] args) {
		Person p = new Person("john",19);
		p.checkAdult();
	}

}
