package sample.LogicLayer.Plots;

import javafx.scene.effect.Light;
import javafx.scene.paint.Color;
import sample.GUI.graphicContent.Pixel2D;
import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.LogicLayer.DataEntities.HilbertCurve;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Daniel on 10/06/2016.
 */
public class BytePlot extends AbstractCurvePlot {

    public BytePlot(AnalyzableData data) {
        super(data);
        makePlot();
    }

    @Override
    void makePlot() {
        for (int i = 0; i < analyzedData.getLenght(); i++) {
            double grayScale = (analyzedData.getRawData()[i] + 128) / 256.0;
            System.out.println(grayScale);
            Color color = new Color(grayScale, grayScale, grayScale, 1);
            readyPixels[i] = new Pixel2D(getCurvePoints().get(i), color);
        }
    }

    public ArrayList<Point> getCurvePoints() {
        return curvePoints;
    }

    public void setCurvePoints(ArrayList<Point> curvePoints) {
        this.curvePoints = curvePoints;
    }
}
