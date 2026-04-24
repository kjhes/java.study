package pack2;

import pack1.Parent;

public class Child extends Parent{ //parent 클래스에서 상속 public , protected 만 접근 가능
	public void printChild() { //설계도의 메서드는 호출해야 실행
		System.out.println("=== 자식 클래스 접근 ===");
		System.out.println("public a = " + a);
		System.out.println("protected b =" + b);
//		System.out.println("default c = " + c); //default는 같은 패키지안에 있어야 가능
//		System.out.println("private d = "+ d); //private 는 상속해도 안되고 같은 클래스 아님 안됨
		
	}
	
}
