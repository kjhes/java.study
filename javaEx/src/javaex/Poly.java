package javaex;
//부모 클래스
class Shape{
	void draw() {
		System.out.println("도형을 그리다");
	}
}
//자식 클래스
class Circle extends Shape{
	@Override //재정의 == 오버라이딩
	void draw() {
		System.out.println("원을 그리다");
	}
	
}


class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("사각형을 그리다");	
		}
	
	
}

public class Poly {
	public static void main(String[] args) {
		//Circle s = new Circle();
		Shape s = new Circle();  //부모의 바구니에다가 Circle을 담음
		s.draw();
		
		s = new Rectangle();
		s.draw(); //다형성을 본것
	
	}
}
