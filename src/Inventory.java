import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Base>{
    // we need to store items
    //As fast lookups use Hashmap
    private HashMap<String,T> items;
    Inventory(){
        items = new HashMap<>();
    }
    // core methods : add,remove,retrieve and list all the items
    public void add(T item){
        items.put(item.getId(),item);
    }
    public void remove(T item){
        items.remove(item.getId());
    }
    public void remove(String itemId){
        items.remove(itemId);
    }

    //retrieval
    public T getItem(String itemId){
        return items.get(itemId);
    }

    public List<T> getItems(){
        return new ArrayList<>(items.values());
    }



}
