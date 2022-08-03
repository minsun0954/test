package Homework_5;

public class Product {
	//필드
	private int price; // ( 내 자신에서만 쓸 수 있도록 하는 private)
	private int amount;
	private String name;
	
	
	//생성자 (생성자 안 만들어도 가능 -> 자바 컴파일할때 생성자가 없으면 자바가 알아서 기본 생성자를 만듦)
	
	//메소드
	
	//get set만들어서 접근가능하도록
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
