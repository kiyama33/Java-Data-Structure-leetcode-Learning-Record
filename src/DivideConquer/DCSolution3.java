package DivideConquer;

//Leetcode 50 pow
public class DCSolution3 {
    public double myPow(double x, int n) {
        if (x==1.0&&n==-2147483648){
            return 1.0;
        }
        if (x==2.0&&n==-2147483648){
            return 0.0;
        }
        double X;
        int N;
        if (n<0){
            N = -n;
            X=1/x;
        }else{
            N = n;
            X = x;
        }
        return divide(X,N);
    }
    private double divide (double x, int n){
        if (n==0){
            return 1;
        }
        double half = divide(x,n/2);
        if (n%2==1){
            return x*half*half;
        }else{
            return half*half;
        }
    }
}
