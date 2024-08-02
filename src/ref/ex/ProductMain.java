package ref.ex;


public class ProductMain {
    public static void main(String[] args) {
        //여러상품의 주문 정보를 담는 배열 생성
        //createOrder()를 여러번 사용해서 상품주문 정보들을 생성하고 배열에 저장
        //printOrders()를 사용해서 상품 주문정보를 출력
        //getTotalAmount()를 사용해서 총 결제금액 계산
        //총 결제금액출력


        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",3000,2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("맥주", 2000,2);

        printOrders(orders);
        getTotalMount(orders);

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){

        for (ProductOrder order : orders) {
            System.out.println("상품명:"+ order.productName + " 가격:" + order.price + " 수량:" + order.quantity);
        }
    }

    static void getTotalMount(ProductOrder[] orders){
        int getTotalMount = 0;
        for (ProductOrder order : orders) {
            getTotalMount += order.price * order.quantity;
            }System.out.println("총합:" + getTotalMount);
        }
    }

