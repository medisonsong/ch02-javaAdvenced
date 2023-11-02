package kr.s02.collections.list2;

public class Product {
	//멤버 변수 정의
	private String name; //상품명
	private int price; //상품가격
	private String num; //상품번호
	private String maker; //제조사
	private int stock; //재고수
	
	//인자가 없는 생성자
	public Product() {}
	
	//이클립스가 가이드 해주는 대로 생성자 만들기
	//source - Generate constructor using fields
	public Product(String name, int price, String num, String maker, int stock) {
//		super();  자동으로 들어가는거라 삭제해도됨
		this.name = name;
		this.price = price;
		this.num = num;
		this.maker = maker;
		this.stock = stock;
	}
	
	//얘도 자동완성으로 set/get 메서드 만들었음
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
//실제로 멤버 변수만 작성하고 나머지는 자동완성 가능
