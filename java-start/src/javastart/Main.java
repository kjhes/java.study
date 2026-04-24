package javastart;

class Student{ //클래스(설계도) 생성
   //클래스 = 멤버변수(필드) + 메서드(기능) 구성
   String name; //멤버변수
   int score; //멤버변수
   // 생성자(constructor) : 객체 생성할 때 값을 부여
   // 객체 생성할 때 1번 수행
   Student(String n, int s){ //생성자(클래스 이름과 동일)
      name = n;
      score = s;
   }
   
   //메서드 정의(기능, 행위)
   void printInfo(){
      System.out.println(name+", "+score);
   }
   
}


public class Main { //실행하는 클래스

   public static void main(String[] args) { //main method
   
      Student s1 = new Student("홍길동", 90); //객체(인스턴스) 생성
      Student s2 = new Student("이순신", 100); 
      //Student(): 클래스
      //new: 객체 생성 연산자
      // s1: 참조변수, 객체 생성
      
      //s1.name = "홍길동"; //.(점)은 멤버 접근 연산자
      //s1.score= 90; 
      
      s1.printInfo(); //메서드 호출
      
      
      //s2.name = "이순신"; //.(점)은 멤버 접근 연산자
      //s2.score= 100;
      s2.printInfo();
      
      System.out.println("이름은 "+ s1.name);
      System.out.println("점수는 "+ s1.score);
      System.out.println("이름은 "+ s2.name);
      System.out.println("점수는 "+ s2.score);
   }
   
}