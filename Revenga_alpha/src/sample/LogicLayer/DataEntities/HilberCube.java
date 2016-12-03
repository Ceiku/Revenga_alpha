package sample.LogicLayer.DataEntities;

import javafx.geometry.Point3D;

import java.util.ArrayList;

/**
 * Created by Daniel on 11/06/2016.
 */
public class HilberCube {

    ArrayList<Point3D> cubePoints;

    public HilberCube(){


    }

    private void makeCube(int size, int x, int y, int z, int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3){
        if(size == 1)
            cubePoints.add(new Point3D(x, y, z));

        else {
            size /= 2;

            x1 = checkAndModify(x1, size);
            y1 = checkAndModify(y1, size);
            z1 = checkAndModify(z1, size);

            x2 = checkAndModify(x2, size);
            y2 = checkAndModify(y2, size);
            z2 = checkAndModify(z2, size);

            x3 = checkAndModify(x3, size);
            y3 = checkAndModify(y3, size);
            z3 = checkAndModify(z3, size);

            int x1s = (x + x1 * size);
            int y1s = (y + y1 * size);
            int z1s = (z + z1 * size);

            int x2s = x2 * size;
            int y2s = y2 *size;
            int z2s = z2 *size;

            int x3s = x3 * size;
            int y3s = y3 * size;
            int z3s = z3 * size;

            makeCube(size, x, y, z, x1, y1, z1, x2, y2, z2, x3, y3, z3);
            makeCube(size, x1s, y1s, z1s, x3, y3, z3, x1, y1, z1, x2, y2, z2);
            makeCube(size, x1s + x2s, y1s + y2s, z1s + z2s, x3, y3, z3, x1, y1, z1, x2, y2, z2);
            makeCube(size, x + x2s, y + y2s, z + z2s, -x1, -y1, -z1, -x2, -y2, -z2, x3, y3, z3);
            makeCube(size, x + x2s + x3s, y + y2s + y3s, y + y2s + y3s, -x1, -y1, -z1, -x2, -y2, -z2, x3, y3, z3);
            makeCube(size, x1s + x2s + x3s, y1s + y2s + y3s, z1s + z2s + z3s, -x3, -y3, -z3, x1, y1, z1, -x2, -y2, -z2);
            makeCube(size, x1s + x3s, y1s + y3s, z1s + z3s, -x3, -y3, -z3, x1, y1, z1, -x2, -y2, -z2);
            makeCube(size, x + x3s, y + y3s, z + z3s, x2, y2, z2, -x3, -y3, -z3, -x1, -y1, -z1);

        }
    }

    private int checkAndModify(int n, int factor){
        if(n < 0)
            return n - factor*n;

        return n;
    }
}
