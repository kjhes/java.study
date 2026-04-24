package javastart;
class Book { //클래스는 멤버변수와(속성) + 메서드(기능)으로 구성되어져 있다.
	String title;
	String author;
	
	//생성자 오버로딩(똑같은 이름을 가진 생성자가 여러개가 나오면 그걸 오버로딩이라고 부른다)
	Book(String title,String author){ //3
		this.title = title;//3
		this.author = author;//4
	}
	Book(String title){//생성자 호출시 title만 가져옴 //2
//		this.title = title; //왼쪽 title은 클래스 안에서 쓰이는 멤버 변수 오른쪽 title은 호출할때 가져오는 매개변수
//		this.author = "작가미상";
		this(title,"작가미상"); //2
	}
	Book(){ //매개변수가 없는 기본 생성자 원래 자동적으로 생성됨
//		this.title = "";
//		this.author = "";
		this("",""); //생성자간의 호출 원래 this의 의미가 아님 문자열 두개를 넣어서 생성자를 호출 즉 Book(String title , String author)이 실행됨
		System.out.println("기본생성자 호출");
	}
	
	void show(){//6
		System.out.println("title:"+ title);//6
		System.out.println("author:"+ author);//7
	}
}


	

public class BookMain {

	public static void main(String[] args) { 
		Book b1 = new Book("abc"); //1 함수 레퍼런스 생성 -> 생성자 진입(매개변수와 같이)
		b1.show();//5
	}

}
//this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//this() 설명
//① 생성자에서만 사용 가능
//this();  // 생성자 안에서만 사용 가능
//② 반드시 첫 줄에 써야 함 ***
//Car() {
//    this("Avante");  // 반드시 첫 줄
//	  System.out.println("아아라라"); //프린트문은 생성자 호출로 들어가서 다끝나고 출력된다
//}
//
//Car() {
//    speed = 100;
//    this("Avante"); // 에러
//}
//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//Car() {
//    this(); //  무한 호출 → 컴파일 에러

