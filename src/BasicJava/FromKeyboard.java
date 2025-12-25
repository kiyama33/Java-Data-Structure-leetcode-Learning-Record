package BasicJava;

import java.util.Hashtable;
import java.util.Scanner;

public class FromKeyboard {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); //注意这里不可以用scanner.toString,用的话直接不让你输入跳到下面去了
        Hashtable<Character,Integer> count = new Hashtable<>();
        for (int i=0;i<word.length();i++){
            if (!count.containsKey(word.charAt(i))){
                count.put(word.charAt(i),1);
            }else{
                int countnow = count.get(word.charAt(i));
                count.replace(word.charAt(i),countnow++);
            }
        }
        System.out.println("a:"+count.get('a'));
    }
}
