package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap <Key, Value>{
    List<Key> keysList;
    List<Value> valuesList;

    public MyMap() {
        keysList = new ArrayList<>();
        valuesList = new ArrayList<>();
    }
    public void put(Key key, Value value){
        int ind = keysList.indexOf(key);

        if(ind == -1){
            keysList.add(key);
            valuesList.add(value);
        }else{
            valuesList.set(ind, value);
        }
    }
    public Value get(Key key){
        int ind = keysList.indexOf(key);

        if(ind == -1) return null;

        return valuesList.get(ind);
    }
    public Value remove(Key key){
        int ind = keysList.indexOf(key);

        if(ind == -1) return null;

        Value value = valuesList.get(ind);
        keysList.remove(ind);
        valuesList.remove(ind);
        return value;
    }

    public void print(){
        for(int i=0; i<valuesList.size(); i++){
            System.out.print("(" + keysList.get(i) + ": ");
            System.out.print(valuesList.get(i) + ") ; ");
        }
        System.out.println();
    }
}