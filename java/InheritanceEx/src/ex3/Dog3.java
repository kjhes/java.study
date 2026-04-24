package ex3;

public class Dog3 extends Animal3{
	String breed;
	
	Dog3(String name , int age , String breed){
		super(name,age); //부모생성자 호출 , 자식이 부모의 초기화 작업을 이어받음
		this.breed=breed;
	}

	void showDog() {
		show(); //부모 클래스의 메서드를 가져옴
		System.out.println("이름 :" +name);
		System.out.println("품종 :" +breed);
		
	}


}
