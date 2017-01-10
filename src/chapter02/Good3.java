package chapter02;

public class Good3 {
	private String name;
	private int price;
	private int countSold;
	private int countStock;
	
	//기본 생성자
	//기본 생성자는 직접 생성자를 정의 하는 경우 자동으로 만들어지지 않는다
	public Good3(){}
	
	public Good3(String name, int price,int countSold,int countStock){
		this.name = name;
		this.price = price;
		this.countSold = countSold;
		this.countStock = countStock;
	}
}
