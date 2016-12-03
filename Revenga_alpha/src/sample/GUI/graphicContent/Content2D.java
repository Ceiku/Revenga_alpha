package sample.GUI.graphicContent;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ScrollEvent;

/**
 * Created by Daniel on 11/06/2016.
 */
public class Content2D extends Content {

    final DoubleProperty zoomProperty = new SimpleDoubleProperty(200);

    private WritableImage writableImage;
    private ImageView imageView;
    private ScrollPane scrollPane;

    public Content2D(Pixel2D[] pixels, int sizeX, int sizeY){
        super(pixels);
        setScrollPane(new ScrollPane());

        setWritableImage(new WritableImage(sizeX, sizeY));
        setImageView(new ImageView(getWritableImage()));

        getImageView().preserveRatioProperty().set(true);


        zoomProperty.addListener(new InvalidationListener(){
            @Override
            public void invalidated(Observable observable)
            {
                imageView.setFitWidth(zoomProperty.get() * 4);
                imageView.setFitHeight(zoomProperty.get() * 3);
            }
        });

        zoomProperty.addListener(new InvalidationListener(){
            @Override
            public void invalidated(Observable observable)
            {
                imageView.setFitWidth(zoomProperty.get() * 4);
                imageView.setFitHeight(zoomProperty.get() * 3);
            }
        });

        scrollPane.addEventFilter(ScrollEvent.ANY, new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent event) {
                if (event.getDeltaY() > 0) {
                    zoomProperty.set(zoomProperty.get() * 1.1);
                } else if (event.getDeltaY() < 0) {
                    zoomProperty.set(zoomProperty.get() / 1.1);
                }
            }
        });

        scrollPane.setContent(imageView);
    }

    public void setWidth(double width){
        imageView.setFitWidth(width);
    }
    public void setHeight(double height){
        imageView.setFitHeight(height);
    }

    public void paint(){
        for (int i = 0; i < getPaintedLength(); i++) {
            if (i + getPointIndtArray() < getDataArray().length){
                Pixel2D p = getDataArray()[getPointIndtArray() + i];
                if(p != null){
                    paintPixel(p);
                }
            }
        }
    }

    private void paintPixel(Pixel2D pixel){
        writableImage.getPixelWriter().setColor(pixel.x, pixel.y, pixel.getColor());
    }

    public ScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(ScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public WritableImage getWritableImage() {
        return writableImage;
    }

    public void setWritableImage(WritableImage writableImage) {
        this.writableImage = writableImage;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
