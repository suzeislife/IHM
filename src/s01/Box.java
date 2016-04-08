
package s01;

import com.sun.javafx.geom.Point2D;

import javafx.scene.paint.Color;

@SuppressWarnings("restriction")
public class Box extends Rectangle implements Colorable {

	private double border;
	private LineType type;
	private Color c = Color.rgb(0, 0, 0);
	private int test;

	public Box(double x0, double y0, double x1, double y1, double border, LineType type) {
		super(x0, y0, x1, y1);
		this.type = type;
		this.border = border;
	}

	public Box(Point2D downLeft, Point2D upRight, double border, LineType type) {
		super(downLeft, upRight);
		this.type = type;
		this.border = border;
	}

	@Override
	public String toString() {
		return super.toString() + " Type: " + type + " border: " + border + " Color: " + whatColor();
	}

	@Override
	public boolean equals(Object b) {
		Box box = (Box) b;
		return super.equals(b) && box.border == this.border && box.type == this.type;
	}

	@Override
	public void paint(javafx.scene.paint.Color c) {
		this.c = c;
	}

	@Override
	public javafx.scene.paint.Color whatColor() {
		return this.c;
	}
}
