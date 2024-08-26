package access.Ex;

public class Item {
    private String productName;
    private int price;
    private int quantity;

    Item (String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return productName;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
