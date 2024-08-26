package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        ProductOrder dubu = new ProductOrder();
        int total = 0;

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;
        productOrders[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrders[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        productOrders[2] = coke;

        for (ProductOrder po : productOrders) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
            total += po.price * po.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }


}
