package s01;

import com.sun.javafx.geom.Point2D;

@SuppressWarnings("restriction")
public class Rectangle {
	double x0;
	double y0;
	double x1;
	double y1;

	public Rectangle(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.x1 = x1;
		this.y0 = y0;
		this.y1 = y1;
	}

	public Rectangle(Point2D downLeft, Point2D upRight) {
		x0 = downLeft.x;
		y0 = downLeft.y;
		x1 = upRight.x;
		y1 = upRight.y;
	}

	public double getWidth() {
		return x1 - x0;
	}

	public double getHeight() {
		return y1 - y0;
	}

	public boolean isIn(Point2D point) {
		if (point.x < x1 && point.x > x0 && point.y < y1 && point.y > y0)
			return true;
		return false;
	}

	public void move(double x, double y) {
		this.x0 = x0 + x;
		this.x1 = x1 + x;
		this.y0 = y0 + y;
		this.y1 = y1 + y;
	}

	public Rectangle union(Rectangle r) {
		double nx0 = -1;
		double nx1 = -1;
		double ny0 = -1;
		double ny1 = -1;
		if (x0 <= r.x0)
			nx0 = x0;
		else if (x0 > r.x0)
			nx0 = r.x0;

		if (x1 >= r.x1)
			nx1 = x1;
		else if (x1 < r.x1)
			nx1 = r.x1;

		if (y0 <= r.y0)
			ny0 = y0;
		else if (y0 > r.y0)
			ny0 = r.y0;

		if (y1 >= r.y1)
			ny1 = y1;
		else if (y1 < r.y1)
			ny1 = r.y1;

		return new Rectangle(nx0, ny0, nx1, ny1);
	}

	@Override
	public String toString() {
		return "Rectangle [" + x0 + "," + y0 + "] , [" + x1 + "," + y1 + "]";
	}

	@Override
	public boolean equals(Object r) {
		Rectangle rec = (Rectangle) r;
		if (rec.x0 == this.x0 && rec.y0 == this.y0 && rec.y1 == this.y1 && rec.x1 == this.x1) {
			return true;
		}
		return false;
	}

}
