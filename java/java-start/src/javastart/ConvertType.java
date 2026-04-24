package javastart;

import java.util.Scanner; //Scanner 클래스 사용
//import 단축기는 ctrl + shift + o

public class ConvertType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Scanner 는 java.lang에 있는 클래스가 아니여서 import 해야함
		//Scanner : 키보드로 입력을 받기 위해서
		//문자열 입력
		System.out.println("숫자를 문자로 입력하세요");
		String a=sc.nextLine(); //다음줄을 입력 토큰으로 지정 입력 토큰은 입력 문자열을 공백 단위로 입력을 나눈것 
		//nextLine()은 문자열 1줄로 입력받음 \n 이 나올때 까지
		//문자열 -> 숫자로 변환
		//a(문자) -> num(정수)
		int num1=Integer.parseInt(a); //java에서 입력을 대부분 문자열로 받아 계산할때 사용하기 위해 문자열-> 정수 변환
			//Integer(정수) : Wapper class (래퍼 클래스)
			// 기본형을 객체로 감싸는 클래스	
			//Integer.parseInt(a) ; 문자를 정수로 변환
		//숫자  -> 문자열 변환 
		String b = Integer.toString(num1); //toString 문자로 변환
				//toString 앞에 type을 지정
		String b2 = String.valueOf(num1); //valueOf 문자로 변환
				//valueOf 타입 관계 X
		//출력
		System.out.println("입력문자열 :"+a);
		System.out.println("숫자로변환 :"+num1);
		System.out.println("다시 문자열로 변환(toString :"+b);
		System.out.println("다시 문자열로 변환(valueOf :"+b2);
		
		sc.close();//스캔을 더 안할때 메모리를 아끼기 위해서 입력을 끝냄
	}
}
