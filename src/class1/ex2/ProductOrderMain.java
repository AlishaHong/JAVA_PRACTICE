package class1.ex2;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        ProductOrder[] orders = {order1, order2, order3};

        int totalPrice = 0;
        for (ProductOrder o : orders) {
            totalPrice += o.price * o.quantity;
            System.out.println("상품명:"+o.productName + ", 가격:" + o.price + ", 수량:"+o.quantity);

        }
        System.out.println("총 결제금액:"+totalPrice);

    }
}
