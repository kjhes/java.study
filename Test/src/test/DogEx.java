package test;
//자식클래스 / subclass
public class DogEx extends AnimalEx {
	String breed;
	
	DogEx(String name , int age , String breed) {
	super(name ,age);	
	this.breed=breed;
	}
	void showDog() {
		System.out.println("품종 :" + breed);
		System.out.println("나이:"+age+", 이름 : "+name);
	}
		
}
