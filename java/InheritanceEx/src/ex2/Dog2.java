package ex2;

public class Dog2 extends Animal2{
	//오버라이딩 오버로딩 아님
	@Override
	public void sound() { 
		//override : 자식이 부모와 동일한 메서드를 재정의 
		System.out.println("강아지가 멍멍 짖습니다");
	}
	@Override
	public void move() {
		System.out.println("강아지가 네발로 움직입니다");
	}
}
