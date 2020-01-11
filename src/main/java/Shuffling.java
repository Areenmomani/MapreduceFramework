


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class Shuffling {
    HashMap<String,ArrayList> shuffled=new HashMap<>();
    public HashMap<String,ArrayList> shuffle (Collection<Pair<String,String>> mapped)
    {
        Utils.printBeautiful("shuffling phase start");
        for (Pair<String,String> pair:mapped){
           addValues(pair.getLeft(),pair.getLeft());

    }
        return shuffled;
    }
    private void addValues(String key, String value) {
        ArrayList tempList = null;
        if (shuffled.containsKey(key)) {
            tempList = shuffled.get(key);
            if(tempList == null)
                tempList = new ArrayList();
            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }
       shuffled.put(key,tempList);
    }
}
