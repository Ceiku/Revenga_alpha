package sample.LogicLayer.DataEntities.Factories;

import sample.LogicLayer.DataEntities.HilbertCurve;

import java.util.HashMap;

/**
 * Created by Daniel on 12/06/2016.
 */
public class HilbertCurveFactory {

    private static HashMap<Integer, HilbertCurve> hilbertMap = new HashMap<>();

    public static HilbertCurve makeHilbertCurve(int minSize){
        int order = (int) (Math.log(minSize) / Math.log(4)) + 1;
        if (!hilbertMap.containsKey(order)){
            HilbertCurve newRntry = new HilbertCurve(order);
            hilbertMap.put(order, newRntry);
        }
        return hilbertMap.get(order);
    }
}
