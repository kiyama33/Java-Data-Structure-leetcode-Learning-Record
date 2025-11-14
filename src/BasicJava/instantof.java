package BasicJava;

public class instantof extends fatherinstantof{
    public static void main(String[] args){
        fatherinstantof a1 = new instantof();
        instantof a2 = new instantof();
        fatherinstantof a3 = new fatherinstantof();
        if (a1 instanceof fatherinstantof){
            System.out.println("a1 is-a BasicJava.fatherinstantof");
        }
        if (a2 instanceof fatherinstantof){
            System.out.println("a2 is-a BasicJava.fatherinstantof");
        }
        if (a3 instanceof instantof){
            System.out.println("a3 is-a BasicJava.instantof");
        }
        if (a3 instanceof Object){
            System.out.println("a3 is-a Object");
        }

    }
}
class fatherinstantof{
    int a;
}