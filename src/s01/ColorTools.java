package s01;

import javafx.scene.paint.Color;

public class ColorTools {
  
  public static Colorable[] paintAll(Colorable[] listColor, Color c){
    for(int i = 0 ; i < listColor.length; i++){
      listColor[i].paint(c);
    }
    return listColor;
  }
  
}