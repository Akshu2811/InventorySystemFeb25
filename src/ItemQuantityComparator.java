import java.util.Comparator;

// sort according to descending order of quantity
public class ItemQuantityComparator implements Comparator<Base> {
    public int compare(Base o1, Base o2) {

        //o1 to come first => return -1
        //o2 to come first => return 1
        if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        }
        else if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        }
        return 0;

    }
}
