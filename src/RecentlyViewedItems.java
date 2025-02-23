import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Base> recentlyViewedItems;
    private int MAX_RECENTLY_VIEWED_ITEMS=3;
    public RecentlyViewedItems() {
        recentlyViewedItems = new LinkedList<>();
    }
    public void addRecentlyViewedItem(Base item) {

        // Removing it and adding at top of list
        recentlyViewedItems.remove(item);
        recentlyViewedItems.add(item);

        if(recentlyViewedItems.size()>MAX_RECENTLY_VIEWED_ITEMS){
            recentlyViewedItems.removeFirst();
        }
    }
    public List<Base> getRecentlyViewedItems() {
        return recentlyViewedItems;
    }
}
