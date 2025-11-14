package BasicJava;

public class MathTest {
    public static void main(String[] args){
        double[] array = new double[]{10.5,-10.5,Math.PI,0};
        for (int i=0;i<4;i++){
            System.out.print(Math.abs(array[i])+" "+Math.ceil(array[i])+" "+Math.floor(array[i]));
            System.out.println();
        }
        for (int i=0;i<10;i++) {
            System.out.print( Math.round((Math.random() * 100)) + " ");//注意int）后面不加（）就来个random出来的结果永远都是0
        }
        double a = Math.round(-0.8);
        System.out.println(12/0);
    }
}
