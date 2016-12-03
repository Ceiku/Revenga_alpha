package sample.LogicLayer.DataEntities.Factories;

/**
 * Created by Daniel on 09/06/2016.
 */
public class GenericFactory<K, V> {
    //private static final HashMap<K,V> objectMap = new HashMap<>();

    public GenericFactory(){}

    public V getNew(K... identifiers){
        return null;
    }
}
