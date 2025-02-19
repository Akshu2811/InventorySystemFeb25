public class Base implements Comparable<Base> {
    private String id; //(unique identifier).
    private String name; //(name of the item).
    private double price; //(price of the item).
    private int quantity; //(quantity in stock)

    Base(){

    }

    Base(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(Base o) {

        if(this.price > o.price){
            return 1;
        }
        else if(this.price < o.price){
            return -1;
        }
        return 0;
    }
}
