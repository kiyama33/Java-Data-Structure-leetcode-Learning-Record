package BasicJava;

import java.util.Scanner;

public class JieCheng{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int IntInput = Integer.parseInt(input);
        int sum = 0;
        for (int i = IntInput;i>0;i--){
            int cheng = 1;
            for (int j = i;j>0;j--){
                cheng *= j;
            }
            sum+=cheng;
        }
        System.out.println(sum);
    }
}
