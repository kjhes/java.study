package javastart;

import java.util.Scanner;

class Menu{
	String order;
	Menu(String order){
		this.order =order;
	}
	void printMenu() {
		System.out.println("김주형 카페 메뉴는 :" + order);
	}
	
}





public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu [] menuArr  = new Menu[3];
		menuArr[0] = new Menu("Coffee");
		menuArr[1] = new Menu("Tea");
		menuArr[2] = new Menu("Juice");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴번호를 입력하세요 1.커피 2.티 3.주스");
			int snum=sc.nextInt();

			if (snum == 0) break;
			switch(snum) {
			
			case 1:
				menuArr[0].printMenu();
				break;
			case 2:
				menuArr[1].printMenu();
				break;
			case 3:
				menuArr[2].printMenu();
				break;
			
			default :
				System.out.println("없는 매뉴 입니다");
				break;
			}//switch
		}//while 
		sc.close();
	}//main
}//public class
