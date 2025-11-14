package BasicJava;

public class exception {
    public static void main(String[] args){
        exception test=new exception();
        try{
            String result2="12345";
            System.out.println(test.reverse(result2));
            String result1="";
            System.out.println(test.reverse(result1));
        }catch (EmptyStringException e){ //或者RuntimeException e，但最好为每个要处理的异常单独写！
            e.printStackTrace();
            System.out.println("catch BasicJava.exception: " + e.getMessage());
        }finally{
            System.out.println("Complete");
        }
    }
    public String reverse(String a){
        if (a.length()==0){
            throw new EmptyStringException("length=0");
        }
        String reverseString = "";
        for (int i = a.length() - 1; i >= 0; --i) {
            reverseString += a.charAt(i);
        }
        return reverseString;
    }
}
// 自定义异常类：表示字符串长度为0的异常
class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}
