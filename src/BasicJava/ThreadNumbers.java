package BasicJava;

public class ThreadNumbers {
    public static void main(String[]args){
        Thread t = new Thread(new ThreadnumberTest());
        t.start();
    }
}
class ThreadnumberTest implements Runnable{
    public void run(){
        for (int i =0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){

            }
        }
    }
}
