package sample.LogicLayer;


import sample.LogicLayer.DataEntities.AnalyzableData;
import sample.LogicLayer.DataEntities.Factories.AnalyzableDataFactory;
import sample.LogicLayer.DataEntities.HilbertCurve;
import sample.LogicLayer.Plots.*;

/**
 * Created by Daniel on 09/06/2016.
 */
public class LogicFacade {

    private ParentPlot plot;
    private AnalyzableData currentData;

    public LogicFacade(){
    }

    public void makePlot(String plotType){
        switch(plotType){
            case "DotPlot":
                plot = new DotPlot2D(currentData);
                break;
            case "ScatterPlot":
                plot = new ScatterPlot(currentData);
                break;
            case "BytePlot":
                plot = new BytePlot(currentData);
                break;
            case "ValuePalette":
                plot = new ValuePalette(currentData);
            
            default:
                break;
        }
    }

    public ParentPlot getPlot() {
        return plot;
    }

    public void setPlot(ParentPlot plot) {
        this.plot = plot;
    }

    public AnalyzableData getCurrentData() {
        return currentData;
    }

    public boolean makeCurrentData(String path){
        if (path == null)
            return false;
        currentData = AnalyzableDataFactory.makeAnalyzableData(path);
        if (currentData != null)
            return true;
        return false;
    }
}
