package pack1;

public class Parent {
//		System.out.println("=== 같은 패키지 테스트 ==="); // 실행문이 설계쪽에 있어서 실행문이 실행이 안된다 함수 안에 있어야 실행됨
		public int a =10;
		protected int b = 20;
		int c =30; //default 
		private int d =40;
		
		public void show() {
			System.out.println("Parent 메서드 실행");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			//여기서 d가 되는 이유는 같은 클래스에 속해 있기 때문이다.
		}
//	   public static final String RED = "\u001B[31m";
//	     public static final String GREEN = "\u001B[32m";
//	     public static final String BLACK = "\u001B[30m";
//	     public static final String YELLOW = "\u001B[33m";
//	     public static final String BLUE = "\u001B[34m";
//	     public static final String PURPLE = "\u001B[35m";
//	     public static final String MINT = "\u001B[36m";
//	     public static final String WHITE = "\u001B[37m";
//	     public static final String RESET = "\u001B[0m";
//	
//	
//	public static void main(String[] args) {
//		
//	}
}
