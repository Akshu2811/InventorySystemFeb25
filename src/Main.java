import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Base> items = new ArrayList<Base>();
        items.add(new Clothing("C1","T-shirt",999.99,10,"L"));
        items.add(new Book("B1","Surrounded by idiots",299.99,20,"John Doe"));
        items.add(new Electronics("E1","Laptop",19999.99,2,3));

        System.out.println("Before sorting:");
        for (Base item : items) {
            System.out.println(item.getName());
        }
        //Collections.sort(items); It will get sorted by comparable (compareTo function)
        Collections.sort(items,new ItemQuantityComparator());
        System.out.println("After sorting:");
        for (Base item : items) {
            System.out.println(item.getName());
        }

        Inventory<Electronics> electronicsInventory=new Inventory<>();
        electronicsInventory.add(new Electronics("E1","Laptop",19999.99,2,3));
        electronicsInventory.add(new Electronics("E2","ipad",99999.99,4,5));
        electronicsInventory.add(new Electronics("E3","MacBook",199999.99,3,4));
        System.out.println("Items in the inventory:"+electronicsInventory.getItems());

        Base item1 = new Electronics("E1", "Laptop", 999.99 , 5, 24);
        Base item2 = new Electronics("E2", "Mobile", 999.99 , 5, 24);
        Base item3 = new Electronics("E3", "Watch", 999.99 , 5, 24);
        Base item4 = new Electronics("E4", "Ipad", 999.99 , 4, 24);
        Base item5 = new Electronics("E5", "Speaker", 999.99 , 4, 24);

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();

        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item1);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);


        System.out.println("RecentlyViewedItems List : ");
        List<Base> recentlyViewedItemsList = recentlyViewedItems.getRecentlyViewedItems();
        for (Base item : recentlyViewedItemsList) {
            System.out.println(item.getName());
        }
    }
}