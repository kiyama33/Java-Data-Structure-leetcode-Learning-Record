package BasicJava;

public class override {
    public static void main(String[] args){
        Animal a = new horse();//编译看前面的Animal，运行看后面的horse！
        a.eat();
    }
}
class Animal{
    public void eat(){
        System.out.println("animal eat");
    }
}
class horse extends Animal{
    @Override
    public void eat(){
        super.eat();//调用父类方法
        System.out.println("BasicJava.horse eat");
    }
    public void shout(){
        System.out.println("BasicJava.horse shout");
    }
}
