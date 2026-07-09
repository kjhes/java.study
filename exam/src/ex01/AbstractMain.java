package ex01;
abstract class Company {
    String name;

    Company(String name) {
        this.name = name;
    }

    //공통 메서드
    void start() {
        System.out.println(name + "이 출근했습니다");
    }

    void end() {
        System.out.println(name + "이 퇴근했습니다");
    }

    //직무마다 다른 기능
    abstract void work();
    //추상 메서드: 내용 구현이 없음, 추상 클래스 안에 있어야함
    // 미완성, 자식드이 반드시 메서드를 완성해야함(강제성)
    //일하는 기능-직무마다 하는일이 다름
}

class Devel extends Company{ //상속
    Devel(String name ){
        super(name); //부모 생성자 호출
    }
    @Override
    void work(){
        System.out.println(name + "이 프로그램을 개발합니다");
    }
}

class Designer extends Company{
    Designer(String name){
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + "이 디자인 합니다");
    }
}
class Planner extends Company{
    Planner(String name){
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + "이 기획 합니다");
    }
}


public class AbstractMain {
    public static void main(String[] args) {
        Company c1 = new Devel("홍길동"); //다형성
        Company c2 = new Devel("홍명보"); //다형성
        Company c3 = new Devel("홍박사"); //다형성

        c1.start();
        c1.work();
        c1.end();
        System.out.println("\n");
        c2.start();
        c2.work();
        c2.end();
        System.out.println("\n");
        c3.start();
        c3.work();
        c3.end();
        System.out.println("\n");
    }
}
