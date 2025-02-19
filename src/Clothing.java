public class Clothing extends Base{

    private String size;

    Clothing(String size){
        this.size = size;
    }
    Clothing(String id, String name, double price, int quantity,String size){
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
