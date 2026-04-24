package ex1;

public class Main {
	public static void main(String [] args) {
		Dog dog = new Dog();
		dog.name = "뽀삐";
		dog.age = 2;
		dog.color = "검정";
		
		dog.sleep(); //animal 에 있는 sleep 함수는 일단 public으로 선언되어져 있기 때문에 객체로 만들어서 Main에 main에서 실행해도 실행이 잘 됐다
		dog.eat(); //sleep 과 같다
//		dog.show(); //sleep 과 같다
		
		//자식 클래스 메서드 호출
		dog.bark();
		dog.run();
		
	}
	
}
