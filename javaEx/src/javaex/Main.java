package javaex;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("홍길동",201,3500000);
		
		e.print();
		//이름을 이순신으로 수정
		//사번을 205 로 수정
		//급여는 5000000으로 수정
		//출력
		e.setName("이순신");
		e.setNo(205);
		e.setPay(5000000);
		
		System.out.println("수정 정보");
		e.print();
		
	}
}
