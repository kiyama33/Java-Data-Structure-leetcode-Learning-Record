package BasicJava;

public class constructTest {
    public static void main(String[] args){
        tshirt t = new tshirt("T");
        tshirt t2= new tshirt();
    }
}
class clothes{
    clothes(String s){
        System.out.println(s+"BasicJava.clothes");
    }
    clothes(){
        System.out.println("null BasicJava.clothes");
    }
}
class tshirt extends clothes{
    tshirt(){
        super();
        System.out.println("null BasicJava.tshirt");
    }
    tshirt(String s){
        super(s);
        System.out.println(s+"BasicJava.tshirt");
    }
}
