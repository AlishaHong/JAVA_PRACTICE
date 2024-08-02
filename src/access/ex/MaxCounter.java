package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    //increment() 숫자를 하나씩 증가시키는 메서드
    public void increment(){
        if(count < max){
            count++;
        }else{
            System.out.println("최대값입니다.");
        }
    }
    //getCount() 지금까지 증가한 값을 가져오는 메서드
    public int getCount(){
//        System.out.println("현재 값 : " + count);
        return count;
    }

}
