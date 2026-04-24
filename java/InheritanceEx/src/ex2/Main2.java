package ex2;

public class Main2 {
	public static void main(String [] args ) {
		Dog2 dog2 = new Dog2();
		dog2.sound(); //자식의 메서드 수행 
		dog2.move(); 
		
		Animal2 a = new Animal2();
		a.sound();
		a.move();
	}
}
