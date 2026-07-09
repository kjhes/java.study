package ex01;

class Bank{
    String owner;
    int balance;
    static int count =0;
    Bank(String owner , int balance , int count ){
        this.owner = owner;
        this.balance = balance;
        this.count = count;
    }
    Bank(String owner , int balance){
        this.owner = owner;
        this.balance = balance;
        count ++;
    }
    Bank(String owner ){
        this.owner = owner;
    }
    Bank(){

    }
    void show(){
        System.out.println(owner + "잔액"+balance+"원");
    }
    static void showcount(){
        System.out.println( "의 count는 :"+count);
    }
}


public class Static_Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("홍길동",100000);
        Bank b2 = new Bank("권율",300000);

        b1.balance += 5000;
        b2.balance +=10000;
        b1.show();
        b2.show();

        System.out.println(b1.owner + "의 잔액은 :"+b1.balance);
        System.out.println(b2.owner + "의 잔액은 :"+b2.balance);
        System.out.println(b1.owner + "의 count는 :"+Bank.count);
        Bank.showcount();


    }

}
