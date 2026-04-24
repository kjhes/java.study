package javastart;

import java.util.Scanner;

class StudentP{
	String name;
	int score;

	StudentP(String name, int score){
		this.name = name;
		this.score = score;
	}
	StudentP(String name){
		this(name,0);
	}
	StudentP(){
		this("",0);
	}
}
public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명");
		int cnt = sc.nextInt();
		sc.nextLine();
		StudentP [] stu = new StudentP[cnt];
		//반복문을 통해 배열 요소 객체 생성
		//값을 키보드로부터 입력받음
		for (int i = 0; i< stu.length;i++) {
			System.out.println((i+1)+"번째 학생 이름 입력:");
			String name = sc.nextLine();
			System.out.println((i+1)+"번째 학생 점수 입력:");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name,score);
		}
		//이름 검색
		while (true) {
			System.out.println("검색할 학생 이름 입력");
			String sname= sc.nextLine();			
			int brk=0;
			boolean brk2=false;
			if (sname.equals("그만")) break; //java에서는 문자열에서는 ==을 쓰지않는다 왜냐 String 은 클래스이기 때문에	
			for (int i =0 ; i < stu.length ; i++) {
				if (sname.equals(stu[i].name)) {
					System.out.println(stu[i].score);
					brk =1;
					brk2 = true;
					break; //for break는 가장 가까운 반복문(while,for)을 탈출한다 1번만
				}//if
			
			
			}//for
			if (brk == 1 || brk2) System.out.println("찾았음"); //boolean 형인 그냥 변수 이름 만쓰면 ==true? 이거고 반대의 경우에는 !를 변수이름 앞에 붙이면 된다 그럼 !=true가 된다
			else System.out.println("못 찾았음");
			
			
		}//while
	
		sc.close();
		System.out.println("정상 종료");
	}//main

}//public class StudentScore
