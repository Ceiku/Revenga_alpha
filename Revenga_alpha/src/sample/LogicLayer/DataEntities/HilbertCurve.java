package sample.LogicLayer.DataEntities;

import java.awt.*;

/**
 * Created by Daniel on 09/06/2016.
 */
public class HilbertCurve extends SpaceCurve {
    private static int recursiveCounter;

    public HilbertCurve(int order){
        super("Hilbert " + order);
        int size = (int)Math.pow(2, order);
        hilbertRecurr(0, 0, size, 0, 0, size, order);
    }

    private void hilbertRecurr(double x, double y, double xi, double xj, double yi, double yj, int n) {
        if (n <= 0) {
            curvePoints.add((new Point((int)(x  + (xi + yi)/2),(int)(y + (xj + yj)/2))));
        } else {
            hilbertRecurr(x, y, yi / 2, yj / 2, xi / 2, xj / 2, n - 1);
            hilbertRecurr(x + xi / 2, y + xj / 2, xi / 2, xj / 2, yi / 2, yj / 2, n - 1);
            hilbertRecurr(x + xi / 2 + yi / 2, y + xj / 2 + yj / 2, xi / 2, xj / 2, yi / 2, yj / 2, n - 1);
            hilbertRecurr(x + xi / 2 + yi, y + xj / 2 + yj, -yi / 2, -yj / 2, -xi / 2, -xj / 2, n - 1);
        }
    }
}
