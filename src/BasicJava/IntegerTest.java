package BasicJava;

public class IntegerTest {
    public static void main(String[] args){
        Integer i1 = new Integer("1");//过时了呵呵
        Integer i2 = Integer.parseInt("1");
        Integer i3 = Integer.valueOf("1");
        String s1 = i3.toString();
        Character c1 = Character.valueOf('c');
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.valueOf(s1);
        System.out.println(int1+" "+int2);
    }
}
