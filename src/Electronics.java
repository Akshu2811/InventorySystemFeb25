public class Electronics extends Base{
    private int warranty;

    Electronics(int warranty) {
        this.warranty = warranty;
    }
    Electronics(String id, String name, double price, int quantity,int warranty) {

        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
