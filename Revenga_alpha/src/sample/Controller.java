package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import sample.GUI.ScrollTab;
import sample.GUI.graphicContent.Pixel2D;
import sample.LogicLayer.FileIO.FileIO;
import sample.LogicLayer.LogicFacade;

import javafx.event.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    LogicFacade logicFacade;
    private boolean hasOpenedFile;

    @FXML
    private TabPane tabPane;
    @FXML
    private CheckBox is3D;
    @FXML
    private ToggleGroup wordSize;
    @FXML
    private RadioButton eight, sixteen;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logicFacade = new LogicFacade();
        hasOpenedFile = false;
    }

    public void openFile() {
        // TODO :: check if user wants to save
        hasOpenedFile = logicFacade.makeCurrentData(FileIO.selectFilePath());
    }

    public void showSettings() {
    }

    public void BytePlot() {
        actionWrapper("BytePlot");
    }

    public void DotPlot2D() {
        actionWrapper("DotPlot");
    }

    public void ValuePalette2D() {
        actionWrapper("ValuePalette");
    }

    public void ScatterPlot() {
        actionWrapper("ScatterPlot");
    }

    public void LocalEntropyPlot() {

    }

    private void actionWrapper(String actionID){
        if(hasOpenedFile){
            logicFacade.makePlot(actionID);
            makeTab(actionID, logicFacade.getPlot().getReadyPixels());
        }
    }
    public void makeTab(String name, Pixel2D[] pixels){
        tabPane.getTabs().add(new ScrollTab(name, pixels));
    }

    public void contextMenuEvent() {
        if (is3D.isSelected()){
            System.out.println("3D not yet supported");
        }
        if (eight.isSelected())
            System.out.println("eight");
        else if (sixteen.isSelected())
            System.out.println("sixteen");
    }


    /*private void initWorkSpace(){
        MAIN_SCENE.widthProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
                VIEWPORT_SIZE = (double)newSceneWidth;
                //tabPane.setTabMaxWidth(VIEWPORT_SIZE);
                for (Tab tab : tabPane.getTabs()) {
                    ScrollTab tabby = (ScrollTab) tab;
                    tabby.resizeWidth(VIEWPORT_SIZE);
                }
            }
        });

        MAIN_SCENE.heightProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
                System.out.println("Height: " + newSceneHeight);
            }
        });
    }*/
}
