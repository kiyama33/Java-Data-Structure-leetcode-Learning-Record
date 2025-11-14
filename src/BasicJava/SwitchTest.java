package BasicJava;

public class SwitchTest {
    public static void main(String[] args){
        int a=0;
        switch(a){
            case 0:
                System.out.println(a);
                break;
            default:
                System.out.println("int");
        }
        char b = 'a';
        switch(b){
            case 'a':
                System.out.println(b);
                break;
            default:
                System.out.println("char");
        }
    }
}
