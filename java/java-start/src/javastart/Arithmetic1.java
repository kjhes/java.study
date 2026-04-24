package javastart;

public class Arithmetic1 {
	public static void main(String[] args) {
		int x = 20; 
		int y = 10;
		int res1 = add(x, y);
		int res2 = sub(x, y);
		
		System.out.println(res1);
		System.out.println(res2);
	}
	public static int add(int a , int b) {
		return a+b;
	
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}
