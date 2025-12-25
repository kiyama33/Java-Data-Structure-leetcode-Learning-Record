package BasicJava;

public class ThreadBank {
    public static void main(String[]args){
        account sharedaccount = new account("sharedaccount",50);
        runbank test1 = new runbank(sharedaccount);
        runbank test2 = new runbank(sharedaccount);
        new Thread(test1).start();
        new Thread(test2).start();
    }
}
class runbank implements Runnable{
    private account a;
    runbank(account a){
        this.a = a;
    }
    public void run(){
        a.withdraw(30);
    }
}
class account{
    private String name;
    private int amount;
    account(String name,int account){
        this.name=name;
        this.amount=account;
    }
    public int getAmount(){
        return amount;
    }
    public synchronized void withdraw(int money){
        if (amount>=money){
            amount = amount-money;
            System.out.println("取钱成功");
            System.out.println("还剩下"+this.getAmount());
        }else{
            System.out.println("存款不足");
            System.out.println("还剩下"+this.getAmount());
        }
    }
}
