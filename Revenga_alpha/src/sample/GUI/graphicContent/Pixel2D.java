package sample.GUI.graphicContent;


import javafx.scene.paint.Color;

import java.awt.*;

/**
 * Created by Daniel on 09/06/2016.
 */
public class Pixel2D extends Point {

    protected Color color;

    public Pixel2D(int x, int y, Color color){
        super(x,y);
        setColor(color);
    }
    public Pixel2D(Point p, Color color){
        super(p);
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getColor().toString();
    }
}
