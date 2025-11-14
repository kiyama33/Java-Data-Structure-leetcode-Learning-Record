package BasicJava;
public class myException {
    public static void main(String[] args){
        myException a = new myException();
        try{
            String test1="banana";
            String test2="xiangcai";
            System.out.println(a.checkfood(test1));
            System.out.println(a.checkfood(test2));
        }catch (BadFoodException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    String checkfood(String food)throws BadFoodException{
        if (food.equals("xiangcai")){
            throw new BadFoodException("xiangcai!");
        }
        return "good food";
    }
}
class BadFoodException extends Exception{
    public BadFoodException(String message){
        super(message);
    }
}
