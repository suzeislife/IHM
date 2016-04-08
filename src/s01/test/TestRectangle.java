package s01.test;

import com.sun.javafx.geom.Point2D;

import s01.Box;
import s01.LineType;
import s01.Rectangle;

@SuppressWarnings("restriction")
public class TestRectangle {

	public static void main(String[] args) {
		boolean ok = true;
		Rectangle rect1 = new Rectangle(new Point2D(2, 4), new Point2D(5, 6));
		Rectangle rect2 = new Rectangle(1, 8, 3, 15);
		if (rect1.getWidth() != 3)
			ok = false;
		if (rect1.getHeight() != 2)
			ok = false;
		if (rect2.getWidth() != 2)
			ok = false;
		if (rect2.getHeight() != 7)
			ok = false;
		System.out.println("rect1 " + rect1.toString());
		System.out.println("rect2 " + rect2.toString());
		System.out.println("Union " + rect1.union(rect2).toString());
		System.out.println("rect1 " + rect1.toString());
		rect1.move(2, 1);
		System.out.println("rect1 after move " + rect1.toString());
		if (rect1.equals(rect2))
			ok = false;
		if (!rect1.equals(rect1))
			ok = false;
		System.out.println();
		if (!rect2.isIn(new Point2D(2, 10)))
			ok = false;
		if (rect1.isIn(new Point2D(20, 10)))
			ok = false;
		if (ok)
			System.out.println("Test rectangle successfull");
		else
			System.out.println("Error");
		System.out.println();
		System.out.println();

		boolean okBox = true;
		Box box1 = new Box(new Point2D(2, 4), new Point2D(5, 6), 1, LineType.DOTTED);
		Box box2 = new Box(1, 8, 3, 15, 2, LineType.PLAIN);
		if (box1.getWidth() != 3)
			okBox = false;
		if (box1.getHeight() != 2)
			okBox = false;
		if (box2.getWidth() != 2)
			okBox = false;
		if (box2.getHeight() != 7)
			okBox = false;
		System.out.println("box1 " + box1.toString());
		System.out.println("box2 " + box2.toString());
		System.out.println("Union " + box1.union(box2).toString());
		System.out.println("box1 " + box1.toString());
		box1.move(2, 1);
		System.out.println("box1 after move " + box1.toString());
		if (box1.equals(box2))
			okBox = false;
		if (!box1.equals(box1))
			okBox = false;
		System.out.println();
		if (!box2.isIn(new Point2D(2, 10)))
			okBox = false;
		if (box1.isIn(new Point2D(20, 10)))
			okBox = false;
		if (okBox)
			System.out.println("Test box successfull");
		else
			System.out.println("Error");
	}

}
