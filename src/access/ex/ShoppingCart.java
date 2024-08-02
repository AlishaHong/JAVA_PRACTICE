package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //10개 초과 등록시 "장바구니가 가득찼습니다" 출력

    public void addItem(Item item){

        if(itemCount > items.length){
            System.out.println("장바구니가 가득찼습니다.");
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품출력");
        for(int i = 0; i < itemCount ; i++){
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotal());
        }
        System.out.println("총 합계 " + calPrice());
    }

    private int calPrice(){
        int totalPrice = 0;
        for(int i = 0 ; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotal();
        }return totalPrice;
    }
}
