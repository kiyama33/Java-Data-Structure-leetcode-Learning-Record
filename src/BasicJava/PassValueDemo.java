package BasicJava;

public class PassValueDemo{
    int x;
    int[] array ;
    public static void main(String[] args){
        PassValueDemo p = new PassValueDemo();
        p.x=0;
        p.array = new int[2];
        //p.array[0]=0;
        //p.array[1]=0;
        p.function1(p.x);
        p.function2(p.array);
        System.out.println(" now x is " + p.x);
        System.out.println("now array is " + p.array[0]);
    }
    void function1(int x1){
        x1++;
        System.out.println("x1 in function1 is " + x1);
    }
    void function2(int[]x2){
        x2[0]=-999;
        System.out.println("x2 in function2 is" + x2[0]);
    }
}
