package test;

//super 클래스 / 부모 클래스
public class AnimalEx {
	String name;
	int age;
	
	void show() {
		System.out.println("이름 :" +name);
		System.out.println("나이 :" +age);
	}
			
	AnimalEx(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	
}
