package mypackage;

import chapter02.Goods;

public class GoodsApp {
	static int i;
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		// deault는 같은 패키지에서만 접근 가능
		//camera.countSold = 100;
	}

}
