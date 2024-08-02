package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        //10000원 입금
        //9000원 출금
        //2000원 출금

        //실행결과
        //잔액부족
        //잔고출력 : 1000
    }
}

class Account{
    int balance;

    //입금메서드
    //입금시 잔액 증가
    void deposit(int amount){
        System.out.println(amount + "원이 입금되었습니다.");
         balance += amount;
        System.out.println("잔액 : " + balance);
    }
    //출금메서드
    //출금시 잔액 감소
    //만약 잔액이 부족하면 작액부족을 출력해야한다.
    void withdraw(int amount){
        if(balance < amount) {
            System.out.println(amount + "원 출금합니다.");
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 출금 가능금액 : "+ balance);
        }else{
            System.out.println(amount + "원 출금합니다.");
            balance -= amount;
            System.out.println("잔액 : " + balance);

        }




    }
    //잔액확인메서드

}
