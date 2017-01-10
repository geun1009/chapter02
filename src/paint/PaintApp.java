package paint;

public class PaintApp {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		pt1.setX( 100 );
		pt1.setY( 200 );
		pt1.show();
		
		pt1.show(false);
		pt1.show();//show(true);
	}

}
