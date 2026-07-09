package ex01;

class Product{
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}







public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setName("홍길동");
		p.setPrice(3000000);
		p.setPrice(5500000);
		
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		
	}

}
