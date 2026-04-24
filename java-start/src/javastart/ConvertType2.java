package javastart;

import java.util.Scanner;

public class ConvertType2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 문자로 입력하세요");
		String a= sc.nextLine();
		
		double num1 = Double.parseDouble(a);
		String str2 = String.valueOf(num1);
		String str1 = Double.toString(num1);
		System.out.println("입력문자열 :"+a);
		System.out.println("숫자로변환 :"+num1);
		System.out.println("다시 문자열로 변환(toString :"+str1);
		System.out.println("다시 문자열로 변환(valueOf :"+str2);
		sc.close();
	}

}
