package animalTest;
//자식/서브 클래스
public class CatChild extends AnimalParent{
   String color;
   int weight;

   CatChild(String name,int age, String color,int weight) {
      super(name,age);//부모생성자 호출
      this.color = color;
      this.weight = weight;
   }
   //오버라이딩
   @Override
   void speak() {
      System.out.println(name+"가 야옹~ 웁니다.");
   }

   
   void infoCat() {
      System.out.println("색상:"+ color + ", 몸무게:" + weight + "kg");
   }


}