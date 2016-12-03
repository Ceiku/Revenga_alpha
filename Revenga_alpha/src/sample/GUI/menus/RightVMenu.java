package sample.GUI.menus;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.HashMap;

/**
 * Created by Daniel on 11/06/2016.
 */
public class RightVMenu extends GridPane {
    private HashMap<String, String[]> instructions;


    private GridPane gridPane;
    private Label selectionPointLabel, selectionSizeLabel;
    private TextField selectionPoint, selectionSize;

    public RightVMenu(){
        super();

        //setPadding(new Insets(0, 0, 0, 0));
        setHgap(-5);
        setVgap(1);

        selectionPointLabel = new Label("Point in file");
        selectionPointLabel.setScaleX(0.7);
        selectionPointLabel.setScaleY(0.7);

        selectionSizeLabel = new Label("View Size");
        selectionPoint = new TextField();
        selectionPoint.setScaleX(0.4);
        selectionPoint.setScaleY(0.7);
        selectionSize = new TextField();

        GridPane.setConstraints(selectionPointLabel,0 ,0);
        GridPane.setConstraints(selectionPoint, 1, 0);

        GridPane.setConstraints(selectionSizeLabel, 0, 1);
        GridPane.setConstraints(selectionSize, 1, 1);

        getChildren().addAll(selectionPointLabel, selectionPoint, selectionSizeLabel, selectionSize);
        instructions = new HashMap<>();
    }
}
