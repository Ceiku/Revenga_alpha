package sample.LogicLayer.Plots;


import javafx.scene.paint.Color;
import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.GUI.graphicContent.Pixel2D;

/**
 * Created by Daniel on 10/06/2016.
 */
public class ScatterPlot extends ParentPlot {

    public ScatterPlot(AnalyzableData data) {
        super(data);
        setReadyPixels(new Pixel2D[getAnalyzedData().getLenght() - 1]);
        makePlot();
    }

    @Override
    void makePlot() {

        Color color = new Color(0,0,0,1); // TODO make adjusted by default
        for (int i = 0; i < getAnalyzedData().getLenght() - 1; i++) {
            getReadyPixels()[i] = new Pixel2D(getAnalyzedData().getRawData()[i] + 128, getAnalyzedData().getRawData()[i + 1] + 128, color);
        }
    }
}
