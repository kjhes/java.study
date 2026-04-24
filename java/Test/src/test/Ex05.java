package test;

class Book{
	String title;
	Book(String title){
		this.title = title;
	}
	
	
}




public class Ex05 {
	public static void main(String[] args) {
		Book [] b = new Book[3];
		b[0] = new Book("노인과 바다");
		b[1] = new Book("노인과");
		b[2] = new Book("노인과 바다");
		
		for (int i=0 ; i < b.length ; i++) { //length 는 배열에서 쓰고 length()는 문자열에서 쓴다
			System.out.println(b[i].title);
			
		}
	
	
	}
	
}
