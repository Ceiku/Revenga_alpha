package sample.LogicLayer.DataEntities;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Daniel on 09/06/2016.
 */
public abstract class SpaceCurve {

    protected ArrayList<Point> curvePoints;
    protected String id;

    public SpaceCurve(String id){
        setCurvePoints(new ArrayList<>());
    }

    public ArrayList<Point> getCurvePoints() {
        return curvePoints;
    }

    public void setCurvePoints(ArrayList<Point> curvePoints) {
        this.curvePoints = curvePoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
