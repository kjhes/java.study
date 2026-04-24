package javaex;

public class Employee { 
	//캡슐화(묶어놓은 것)
	private String name; //정보 은닉
	private int no;  
	private int pay;
	
	Employee (String name , int no , int pay){
		this.name =name;
		this.no=no;
		this.pay = pay;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("이름을 변경 할 수 없습니다");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		System.out.println("사원번호를 변경 할 수 없습니다");
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		if (pay<2200000) {
			System.out.println("월급이 최저 임금 미만입니다.확인해 보세요");
		} else {
			System.out.println("급여를 수정합니다");
			this.pay =pay;
		}
			
		this.pay = pay;
	}
	void print(){
		System.out.println("이름 : "+name+",사번 : "+no+",급여 : "+pay);
	}
	
}
