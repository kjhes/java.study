package animalTest;
//부모 클래스 / 슈퍼 클래스
public class AnimalParent {
   String name;
   int age;
   
    void speak() {
           System.out.println(name+"가 소리를 냅니다. ");
       }
    void info() {
           System.out.println("이름: " + name + ", 나이: " + age + "세");
       }
    
    AnimalParent(String name,int age){
          this.name = name; 
           this.age = age;
    }
}