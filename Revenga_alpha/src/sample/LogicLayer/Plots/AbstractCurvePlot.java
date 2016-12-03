package sample.LogicLayer.Plots;

import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.LogicLayer.DataEntities.Factories.HilbertCurveFactory;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Daniel on 16/06/2016.
 */
public abstract class AbstractCurvePlot extends ParentPlot {

    protected ArrayList<Point> curvePoints;

    // TODO :: Make it take identifier for curve plot
    public AbstractCurvePlot(AnalyzableData data) {
        super(data);
        setCurvePoints(HilbertCurveFactory.makeHilbertCurve(getAnalyzedData().getLenght()).getCurvePoints());
    }

    public ArrayList<Point> getCurvePoints() {
        return curvePoints;
    }

    public void setCurvePoints(ArrayList<Point> curvePoints) {
        this.curvePoints = curvePoints;
    }
}
