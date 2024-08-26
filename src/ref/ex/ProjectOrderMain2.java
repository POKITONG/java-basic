package ref.ex;

public class ProjectOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",2000,2);
        orders[1] = createOrder("김치",5000,1);
        orders[2] = createOrder("콜라",1500,2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder temp = new ProductOrder();
        temp.productName = productName;
        temp.price = price;
        temp.quantity = quantity;
        return temp;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int temp = 0;
        for (ProductOrder order : orders) {
            temp += (order.price * order.quantity);
        }
        return temp;
    }
}
