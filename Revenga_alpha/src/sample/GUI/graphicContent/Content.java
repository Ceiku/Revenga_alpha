package sample.GUI.graphicContent;

/**
 * Created by Daniel on 11/06/2016.
 */
public abstract class Content{

    //final DoubleProperty zoomProperty = new SimpleDoubleProperty(200);
    protected Pixel2D[] dataArray;
    protected int paintedLength, pointIndtArray;

    public Content(Pixel2D[] dataArray, int paintedLength){
        super();
        setDataArray(dataArray);
        setPaintedLength(paintedLength);
        setPointIndtArray(0);
    }

    public Content(Pixel2D[] dataArray){
        this(dataArray, dataArray.length);
    }

    public Pixel2D[] getDataArray() {
        return dataArray;
    }

    protected void setDataArray(Pixel2D[] dataArray) {
        this.dataArray = dataArray;
    }

    public int getPaintedLength() {
        return paintedLength;
    }

    public void setPaintedLength(int paintedLength) {
        this.paintedLength = paintedLength;
    }

    public int getPointIndtArray() {
        return pointIndtArray;
    }

    public void setPointIndtArray(int pointIndtArray) {
        this.pointIndtArray = pointIndtArray;
    }
}
