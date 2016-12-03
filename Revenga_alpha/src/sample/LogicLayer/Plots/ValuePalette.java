package sample.LogicLayer.Plots;

import javafx.scene.paint.Color;
import sample.GUI.graphicContent.Pixel2D;
import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.LogicLayer.DataEntities.HilbertCurve;


import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Daniel on 12/06/2016.
 */
public class ValuePalette extends ParentPlot{
    ArrayList<Point> curvePoints;

    public ValuePalette(AnalyzableData data) {
        super(data);
        curvePoints = new HilbertCurve(getAnalyzedData().getLenght()).getCurvePoints();
        makePlot();
    }

    @Override
    void makePlot() {
        for (int i = 0; i < getAnalyzedData().getLenght(); i++) {
            Color color;
            int check = getAnalyzedData().getRawData()[i] + 128;
            if (check == 0)
                color = new Color(0, 0, 0, 1);
            else if (check < 85)
                color = new Color(1, 0, 0, 1);
            else if (check < 170)
                color = new Color(0, 1, 0, 1);
            else if (check < 255)
                color =  new Color(0, 0, 1, 1);
            else
                color = new Color(1, 1, 1, 1);

            readyPixels[i] = new Pixel2D(curvePoints.get(i), color);
        }
    }
}
