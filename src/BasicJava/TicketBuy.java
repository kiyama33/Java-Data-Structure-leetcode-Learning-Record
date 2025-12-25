package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;

class TicketSell {
    private ArrayList<Integer>money = new ArrayList<>(Arrays.asList(3,0,0));
    public synchronized void sell(String name , int yuan){
        while(true) {
            if (yuan == 5) {
                money.set(0, money.get(0) + 1);
                System.out.println(name + "购票成功");
                print(money);
                notifyAll();
                break;
            }
            if (yuan == 10 && money.get(0) >= 1) {
                money.set(1, money.get(1) + 1);
                money.set(0, money.get(0) - 1);
                System.out.println(name + "购票成功");
                print(money);
                notifyAll();
                break;
            }
            if (yuan == 10 && money.get(0) < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (yuan == 20 && money.get(1) > 0 && money.get(0) >= 1) {
                money.set(2, money.get(2) + 1);
                money.set(1, money.get(1) - 1);
                money.set(0, money.get(0) - 1);
                System.out.println(name + "购票成功");
                print(money);
                notifyAll();
                break;
            }
            if (yuan == 20 && money.get(1) <= 0 && money.get(0) >= 3) {
                money.set(2, money.get(2) + 1);
                money.set(0, money.get(0) - 3);
                System.out.println(name + "购票成功");
                print(money);
                notifyAll();
                break;
            }
            if (yuan == 20 && money.get(1) <= 0 && money.get(0) <= 3) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void print(ArrayList<Integer>money){
        System.out.println("剩余"+money.get(0)+"张5元，"+
                "剩余"+money.get(1)+"张10元，"+
                "剩余"+money.get(2)+"张20元，");
    }
}

class buy implements Runnable{
    private String name;
    private int moneyhave;
    private TicketSell ticketSell;
    public buy(TicketSell ticketSell,String name,int moneyhave) {
        this.moneyhave = moneyhave;
        this.name = name;
        this.ticketSell = ticketSell;
        System.out.println(name+"试图购票");
    }
    public void run() {
        ticketSell.sell(name, moneyhave);
    }
}

public class TicketBuy{
    public static void main(String[] args){
        TicketSell ticketSell = new TicketSell();
        new Thread(new buy(ticketSell,"张某",20)).start(); //implements runnerable和extends Thread的区别就是
        new Thread(new buy(ticketSell,"李某",10)).start();// runnerable实例要再thread实例化这一道工序才能变成线程，才能用start什么的
        new Thread(new buy(ticketSell,"赵某",5)).start();
    }
}
