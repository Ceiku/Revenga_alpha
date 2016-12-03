package sample.LogicLayer.Plots;


import javafx.scene.paint.Color;
import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.GUI.graphicContent.Pixel2D;
import sample.LogicLayer.DataEntities.Factories.HilbertCurveFactory;
import sample.LogicLayer.DataEntities.HilbertCurve;


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Daniel on 09/06/2016.
 *
 * At the moment only implemented for byte sized chunks
 */
public class DotPlot2D extends AbstractCurvePlot {

    private HashMap<Number, Integer> occurence;
    private double average;

    public DotPlot2D(AnalyzableData data) {
        super(data);
        occurence = new HashMap<>();
        makePlot();
    }

    @Override
    void makePlot() {
        countOccurences();
        setAverage();

        for (int i = 0; i < getAnalyzedData().getLenght(); i++) {
            double colorCode = (double)occurence.get(getAnalyzedData().getRawData()[i]) / getAnalyzedData().getLenght();
            Point point = curvePoints.get(i);

            Pixel2D px;
            if (colorCode > average)
                px = new Pixel2D(point, new Color(0, 0, colorCode, 1));
            else
                px = new Pixel2D(point, new Color(0, colorCode, 0.1, 1));
            readyPixels[i] = px;
        }

    }
    private void countOccurences(){
        for (byte b : getAnalyzedData().getRawData()){

            if(!occurence.containsKey(b))
                occurence.put(b, 1);
            else
                occurence.put(b, occurence.get(b) + 1);
        }
    }

    public double getAverage() {
        return average;
    }

    private void setAverage() {
        double total = 0;
        for (int val : occurence.values()) {
            total += val;
        }
        average = total / occurence.size();
    }

}
