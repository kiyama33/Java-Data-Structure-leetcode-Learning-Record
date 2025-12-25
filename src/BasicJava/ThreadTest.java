package BasicJava;

public class ThreadTest {
    public static void main(String[] args){
        Thread t1 = new Thread(new runabletest());
        t1.setName("o");
        Thread t2 = new Thread(new runabletest());
        t2.setName("t");
        Thread t3 = new Thread(new runabletest());
        t3.setName("three");
        t1.start();
        try{
            t1.join();
        } catch(InterruptedException e){
            System.out.println("1 error");
        }
        t2.start();
        try{
            t2.join();
        } catch(InterruptedException e){
            System.out.println("2 error");
        }
        t3.start();
        try{
            t3.join();
        } catch(InterruptedException e){
            System.out.println("3 error");
        }
    }
}
class runabletest implements Runnable{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
