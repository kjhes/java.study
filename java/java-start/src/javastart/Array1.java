package javastart;

//import java.util.Scanner;

class Circle{
	int radius;
	double getArea() {
		return 3.14*radius*radius;
	}
	Circle(int radius){
		this.radius = radius;
	}
	Circle(){
		this(0);
	}
	
}




public class Array1 {

	public static void main(String[] args) {
//		Circle c1 = new Circle(14); //객체 생성 특별한 형태가 아니라 클래스 형이라고 해야함
		Circle [] c; //c가 배열이라는 걸 알려줌 실질적인 선언X
		c = new Circle[5];//5개의 방을 만들었는데 아직도 빈방임 이제 사람들을 넣어서 완성된 객체로 만들어야함
		//Circle [] c= new Circle[5];

		for(int i=0; i<c.length;i++) {
			c[i] = new Circle(i);
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getArea());
		}
	}

}
