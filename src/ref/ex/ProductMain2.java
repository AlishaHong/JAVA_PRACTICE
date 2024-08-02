package ref.ex;


import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        //여러상품의 주문 정보를 담는 배열 생성
        //createOrder()를 여러번 사용해서 상품주문 정보들을 생성하고 배열에 저장
        //printOrders()를 사용해서 상품 주문정보를 출력
        //getTotalAmount()를 사용해서 총 결제금액 계산
        //총 결제금액출력


        Scanner sc = new Scanner(System.in);
        System.out.println("총 주문 개수를 입력하세요");
        int n = sc.nextInt();
        sc.nextLine();//입력버퍼를 비우기 위한 코드
        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 0; i < orders.length; i++){
            System.out.println(i+1 + "번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

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

