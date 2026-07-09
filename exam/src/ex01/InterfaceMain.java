package ex01;

interface Login{
    void login(); //interface 안에 있는 메서드는 자동으로 추상 클래스가 된다
    void logout();
}
interface Print{
    void printinfo();

}
//인터페이스는 다중 구현(2개에서 상속)
class Students implements Login , Print {
    @Override
    public void login(){ //interface 에서 가져올 때는 public을 넣어야 함
        System.out.println("로그인 했습니다");
    }
    @Override
    public void logout(){
        System.out.println("로그아웃 했습니다");
    }
    @Override
    public void printinfo(){
        System.out.println("학생정보를 출력합니다");
    }


}

class Teacher implements Login , Print{
    @Override
    public void login(){ //interface 에서 가져올 때는 public을 넣어야 함
        System.out.println("로그인 했습니다");
    }
    @Override
    public void logout(){
        System.out.println("로그아웃 했습니다");
    }
    @Override
    public void printinfo(){
        System.out.println("선생님정보를 출력합니다");
    }


}




public class InterfaceMain {
    public static void main(String[] args) {
        Login l1 = new Teacher();
        Print L2 = new Teacher();
    }
}
