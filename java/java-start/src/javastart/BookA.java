package javastart;

import java.util.Scanner;

class BookB {
	String title;
	int price;
	
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	BookB(String title,int price){
		this.title = title;
		this.price = price;
	}
	BookB(String title){
		this(title,0);
	}
	BookB(){
		this("title",0);
	}

}


public class BookA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BookB b [];
		b = new BookB[3];
		for (int i=0;i<b.length;i++) {
			System.out.println("제목을 입력하세요:");
			String title = sc.nextLine();
			System.out.println("가격을 입력하세요:");
			int price = sc.nextInt();
			sc.nextLine(); //nextline은 엔터키를 기준으로 나누는데 전에 nextInt에서 사용한 엔터키가 남아 있어 그걸 없애기 위한 방법
			b[i] = new BookB(title,price); //이미 b가 BookB라는걸 28줄에서 선언했기때문에 BookB b 이런식으로 쓰면 안된다
			//배열 요소 마다 객체를 생성한다 b라는 객체의 요소 하나 하나가 작은 객체이다
			
		}
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i].title + b[i].price);
			
		}
		sc.close();
	}

}
