package pack2;

import pack1.Parent; //public 클래스는 어느 곳 에서나 객체 생성이 가능하다 하지만 다른 패키지에 위치한 클래스를 객체 생성하고 싶다면 import는 해 줘야 한다 상속은 할 필요 없다

public class MainTest {
	
	public static void main(String [] args) {
		Parent pa =new Parent();
		Child ch = new Child();
		
		System.out.println("일반 객체 접근");
		System.out.println("public a = "+ pa.a);
//		System.out.println("protected b =" + pa.b);
//		System.out.println("default c =" + pa.c);
//		System.out.println("private d =" + pa.d);
	
		//자식 클래스 접근
		ch.printChild();
	}
}
