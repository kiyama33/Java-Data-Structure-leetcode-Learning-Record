package BasicJava;

public class TestClass1 implements TestInterface1{
    public void bounce(){
        System.out.println("111" + low);
    }
    public String sayBounce(){
        return "222";
    }
    public static void main(String args[]){
        TestClass1 testclass = new TestClass1();
        testclass.bounce();
        if (testclass instanceof TestInterface1){
            System.out.println("it is a bounceinterface");
        }
        System.out.println(testclass.sayBounce());
    }
}
