package s01;

import javafx.scene.paint.Color;

public interface Colorable {
	public void paint(Color c);

	public Color whatColor();

	public default void inverseColor(Color c) {
		c.invert();
	}
}
