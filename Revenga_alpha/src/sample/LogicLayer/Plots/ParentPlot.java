package sample.LogicLayer.Plots;


import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.GUI.graphicContent.Pixel2D;
import sample.LogicLayer.DataEntities.SpaceCurve;

/**
 * Created by Daniel on 09/06/2016.
 */
public abstract class ParentPlot {

    protected AnalyzableData analyzedData;
    protected Pixel2D[] readyPixels;

    public ParentPlot(AnalyzableData data){
        setAnalyzedData(data);
        setReadyPixels(new Pixel2D[getAnalyzedData().getLenght()]); // default for plots to graph all nodes
    }

    public AnalyzableData getAnalyzedData() {
        return analyzedData;
    }

    public void setAnalyzedData(AnalyzableData analyzedData) {
        this.analyzedData = analyzedData;
    }

    public Pixel2D[] getReadyPixels() {
        return readyPixels;
    }

    public void setReadyPixels(Pixel2D[] readyPixels) {
        this.readyPixels = readyPixels;
    }


    abstract void makePlot();
}
