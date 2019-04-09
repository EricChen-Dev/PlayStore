package mess;

import java.awt.Rectangle;

public class retangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(10,5,20,30);
		Rectangle rect2 = rect1;
		rect2.translate(10, 20);
		System.out.println(rect1);
	}

}
