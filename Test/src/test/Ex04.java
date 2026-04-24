package test;

class Car { // 설계도 class
	String model; //멤버 변수(필드)-> 속성
	int speed;
	
	//생성자(매개변수(model,speed) 2개)
	Car(String model,int speed){
		this.model = model; //왼쪽 model -> 필드(멤버 변수), 오른쪽 model은 매개변수
		this.speed = speed;	
	}
	Car(){
		this("",0);
	}
	

	//메서드 -> 기능 , 행위
	void print(){
		System.out.println(model + "," + speed);//println : 출력 +\n
	}
}




public class Ex04{
	public static void main(String args []) {
		//객체를 만들고 참조 변수에 저장
		Car c1 =new Car("소나타",100); //c1도 변수여서 앞에 타입을 써 줘야 하는데 c1 은 클래스 타입 변수이다
		Car c2 =new Car("아반테",120);
		
		//메서드 호출
		c1.print();
		c2.print();
		
	}
	
	
	
}
