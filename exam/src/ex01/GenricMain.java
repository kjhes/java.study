package ex01;
//제너릭 (genric ) 자료형을 미리 딱 정하지 않고 , 사용할 때 정하게 해 주는 문법 하나의 클래스를 여러 자료형에 재사용 할 수 있게 해주는 문법 보통 <> 기호를 사용
//제너릭은 객체만 다룰 수 있기 때문에 wrrapper 클래스를 써야한다
class Box<T>{
    private T data;

    public void setData(T data ){
        this.data = data;
    }

    public T getData(){
        return  data;
    }

} //Box class

public class GenricMain {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.setData("홍길동");
        Box<Integer> scoreBox = new Box<>();
        scoreBox.setData(90);
        Box<Double> doubleBox = new Box<>();
        doubleBox.setData(150.5);
        Box<Boolean> boolBox = new Box<>();
        boolBox.setData(true);

        printBox(scoreBox);
        printBox(doubleBox);
        printBox(nameBox);
        printBox(boolBox);
    }//메인 메서드 끝
    //보조 메서드는 메인(실행) 메서드 안에 넣으면 안된다 왜냐
    //main 에 속허지 도 않고 다른 클래스에도 속하지 않는 함수(메서드 만들기)
    //중첩 클래스는 되지만 중첩 메서드는 안됨
    public static <T> void printBox(Box<T> box) { //보조 메서드(실행함)
        //매게변수로 클래스 설계도를 가져온다 Box<T> type 의 box 객체를 매게변수로 가져옴
        System.out.println("자료형");
        System.out.println(box.getData());
    }



}
//<래퍼클래스>
//래퍼 클래스는 int, double, boolean 같은 기본형 값을 객체처럼 사용할 수 있게 감싸 주는 클래스
//ArrayList 같은 컬렉션에는 기본형 자료형을 직접 넣을 수 없기 때문이다
//ArrayList는 객체를 담는 상자
// 래퍼 클래스는 메서드를 사용할 수 있다
//기본형과 래퍼 클래스
//기본형   래퍼 클래스
//byte           Byte
//short     Short
//int           Integer
//long           Long
//float           Float
//double   Double
//char           Character
//boolean   Boolean





