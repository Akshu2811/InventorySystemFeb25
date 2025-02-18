import java.util.ArrayList;
import java.util.Collections;

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
        Collections.sort(items);
        System.out.println("After sorting:");
        for (Base item : items) {
            System.out.println(item.getName());
        }


    }
}