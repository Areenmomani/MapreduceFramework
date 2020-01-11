import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public interface IReducer {
    public TreeMap<String,Integer> reduce (HashMap<String, ArrayList> shuffled);

}
