package BasicJava;
import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ScannerReaderWriter {
    public static void main(String[]args){
        int[][] scores = new int[3][3];
        File file = new File("src/resources/score.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Scanner scanner = new Scanner(bufferedReader)){
            scanner.useDelimiter("[^0-9.]+");
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    scores[i][j]=scanner.nextInt();
                }
            }
        }catch(IOException e){
            System.out.println("读取出错！");
        }
        int All1st = scores[0][0]+scores[0][1]+scores[0][2];
        int All2st = scores[1][0]+scores[1][1]+scores[1][2];
        int All3st = scores[2][0]+scores[2][1]+scores[2][2];
        double Avg1st = (scores[0][0]+scores[1][0]+scores[2][0])/3.0;
        double Avg2st = (scores[0][1]+scores[1][1]+scores[2][1])/3.0;
        double Avg3st = (scores[0][2]+scores[1][2]+scores[2][2])/3.0;
        double Avg = Avg1st + Avg2st + Avg3st;
    }
}
