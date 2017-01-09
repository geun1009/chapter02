package chapter02;

public class GoodsApp2 {

	public static void main(String[] args) {
		Goods2 goods = new Goods2();
		
		// 객체 변수에 바로 접근하면 잘못 된 데이터를 세팅할 수 있는 가능성 
		// goods.price = -1; 
		goods.setPrice( -1 );
		System.out.println( goods.getPrice() );
		
		//static 변수 테스트
		Goods2 goods1 = new Goods2();
		System.out.println( Goods2.countOfGoods );
		
		Goods2 goods2 = new Goods2();
		System.out.println( Goods2.countOfGoods );
		
		Goods2 goods3 = new Goods2();
		System.out.println( Goods2.countOfGoods );
		goods3.setName( "tv" );
		goods3.setPrice( 5000000 );
		goods3.setCountStock( 1000 );
		goods3.setCountSold( 50 );
		
		//메소드 호출
		goods3.showInfo();
		double discountPrice = 
				goods3.calcDiscountPrice( 0.8 );
		System.out.println( discountPrice );
		
		
	}

}
