import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        List<String> my_list = new ArrayList<String>();
        my_list.add("Hello");
        Map<String, String> my_map = new HashMap<String, String>();
        my_map.put("Name", "John");
        Set<String> my_set = new HashSet<String>();
        my_set.add("Doe");
        System.out.println("List: " + my_list);
        System.out.println("Map: " + my_map);
        System.out.println("Set: " + my_set);
    }
}
