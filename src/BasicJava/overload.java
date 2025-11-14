package BasicJava;

public class overload {
    public static void main(String[] args){
        Testanimal a=new sheep();//注意！在调用参数带对象的重载方法时，看的是前面的！ 这个程序打印“animal eat”
        a.eat(a);//前面为animal的调用不了下面的sheep里的函数！
        sheep s=new sheep();
        s.eat("dog");
        s.eat();
    }
}
class Testanimal{
    public void eat(Testanimal a){
        System.out.println("animal eat");
    }
}
class sheep extends Testanimal{
    public void eat(){
        System.out.println("normal eat");
    }
    public void eat(sheep s){
        System.out.println("BasicJava.sheep eat");
    }
    public void eat(String s){
        System.out.println(s+"BasicJava.sheep eat");
    }
}