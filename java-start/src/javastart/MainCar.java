package javastart;

class Car{ //클래스(설계도) 생성
   //클래스 = 멤버변수(필드) + 메서드(기능) 구성
   String  model; //멤버 변수 지만 대문자인 이유는 String 이 문자열이면서 동시에 클래스 여서
   int speed;
   // 생성자(constructor) : 객체 생성할 때 값을 부여
   // 객체 생성할 때 1번 수행
   Car(String model, int speed){ //생성자(클래스 이름과 동일)
      this.model = model;	 //this:왼쪽은 멤버 변수, 오른쪽은 매개변수
      this.speed = speed;
   }
   Car(String model){
	   this.model = model;
	   this.speed = 0;
   }
   Car(int speed){
	   this.model = "트럭";
	   this.speed = speed;
   }
   Car(){
	   this.model = "트럭";
	   this.speed = 0;
   }
   //메서드 정의(기능, 행위)
   void printInfo(){
      System.out.println(model+", "+speed);
   }
   
}


public class MainCar { //실행하는 클래스

   public static void main(String[] args) { //main method

      Car s1 = new Car("홍길동", 90); //객체(인스턴스) 생성
      Car s2 = new Car("이순신"); 
      Car s3 = new Car(90);
      Car s4 = new Car();
      s1.printInfo(); 
      s2.printInfo();
      s3.printInfo();
      s4.printInfo();
   }
   
}