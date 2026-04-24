package pack1;

public class ParentTest {
	
	public static void main(String [] args) {
		Parent p = new Parent();
		
		System.out.println("== 같은 패키지 테스트 ==");
		System.out.println("public a = " + p.a); //public 은 패키지 프로젝트 상관없이 어디서든지 불러 올 수 있어서
		System.out.println("protected b =" + p.b); //protected 는 같은 패키지 안에서 사용가능하고 같은 패키지가 아니여도 상속받으면 사용 할 수 있다
		System.out.println("default c = " + p.c); //default 는 같은 패키지 안에서 쓰면 사용 가능하다
//		System.out.println("private d = " + p.d); //private 는 같은 클래스 내에서만 적용됨 
		//private 로 d를 선언했기 때문에 동일 클래스가 아닌 ParentTest에서는 접근을 할 수 없다 상속을 받았어도 접근 할 수 없다.
		System.out.println("\n === 메서드 호출 ===");
		p.show();

		
		
	}
}
