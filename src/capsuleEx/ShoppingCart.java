package capsuleEx;

public class ShoppingCart {

    //10개 초과시 장바구니가 꽉참
    private Item[] items = new Item[10];
    private int count;

    public void addItem(Item item){
       if(count > items.length) {
           System.out.println("장바구니가 가득찼습니다.");
       }
            items[count] = item;
            count++;
       }


       public void displayItems(){
           System.out.println("장바구니 상품 출력");
            for(int i = 0; i < count ; i++){
                Item item = items[i];
                System.out.println(item.getName() + item.totalPrice());
            }
           System.out.println("총 합계 : " + getTotalPrice());
       }

       private int getTotalPrice(){
            int totalPrice = 0;
            for(int i = 0; i < count ; i++){
               Item item = items[i];
               totalPrice += item.totalPrice();
           }
           return totalPrice;
       }

    }

