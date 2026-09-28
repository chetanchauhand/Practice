// Print factorial in java
public class Fact {
    public static int cfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_n = cfactorial(n-1);
        int fact_n1 = n*fact_n;
        return fact_n1;
    }
    public static void main(String[] args) {
        int n = 10;
        int ans = cfactorial(n);
        System.out.println(ans);
    }
}
