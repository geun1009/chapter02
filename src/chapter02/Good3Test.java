package chapter02;

public class Good3Test {

	public static void main(String[] args) {
		Good3 g = new Good3();
		g.setName("Nikon");
		g.setPrice(10000000);
		g.setCountSold(100);
		g.setCountStock(20);
		
		// 위에 코드 대신에 다음 생성자로 객체를 생성하면 초기화
		Good3 g2 = new Good3("Nikon",10000000,100,20);
		
		System.out.println(g);
		System.out.println(g2);
	}

}
