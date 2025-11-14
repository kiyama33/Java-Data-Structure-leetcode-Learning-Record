package BasicJava;
public class biaohaoWhile {
    public static void main(String[] args){
        int age = 0;
        outer:
        while (age <= 21) {
            foo:
            while (age==16){
                System.out.println("get license");
                break foo;
            }
            System.out.println("another year");
            age++;
        }
    }
}
