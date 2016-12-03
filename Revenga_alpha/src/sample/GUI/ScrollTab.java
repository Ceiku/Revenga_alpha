package sample.GUI;

import javafx.scene.control.Tab;

import sample.GUI.graphicContent.Content2D;
import sample.GUI.graphicContent.Pixel2D;

/**
 * Created by Daniel on 09/06/2016.
 */
public class ScrollTab extends Tab {

    private static final int defaultTabSizeX = 790;
    private static final int defaultTabSizeY = 600;

    private Content2D displayContent;


    public ScrollTab(String name, Pixel2D[] pixels){
        this(name, pixels, defaultTabSizeX, defaultTabSizeY);
    }

    public ScrollTab(String name,Pixel2D[] pixels, int xSize, int ySize){
        super(name);

        setDisplayContent(new Content2D(pixels, xSize, ySize));

        getDisplayContent().paint();
        setContent(getDisplayContent().getScrollPane());

    }

    public void resizeWidth(double width){
        getDisplayContent().setWidth(width);
    }
    public void resizeHeight(double height){
        getDisplayContent().setHeight(height);
    }

    public Content2D getDisplayContent() {
        return displayContent;
    }

    public void setDisplayContent(Content2D displayContent) {
        this.displayContent = displayContent;
    }
}
