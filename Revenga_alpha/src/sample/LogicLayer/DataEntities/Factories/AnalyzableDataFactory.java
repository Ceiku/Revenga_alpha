package sample.LogicLayer.DataEntities.Factories;


import sample.LogicLayer.DataEntities.AnalyzableData;

import java.util.HashMap;

/**
 * Created by Daniel on 09/06/2016.
 */
public class AnalyzableDataFactory {

    private static HashMap<String, AnalyzableData> dataMap = new HashMap<>();

    public AnalyzableDataFactory(){
    }

    public static AnalyzableData makeAnalyzableData(String path){
        if(!dataMap.containsKey(path)){
            AnalyzableData newEntry = new AnalyzableData(path);
            dataMap.put(path, newEntry);
        }
        return dataMap.get(path);
    }
}
