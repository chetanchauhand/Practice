import java.util.Scanner;

public class Prin {
    public static int calcPow(int x,int y){
        if(y==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpow = calcPow(x, y-1);
        int xpown = x*xpow;
        return xpown;
    }
    public static void main(String[] args) {
        
        // int x = 2, y = 5;
        // int ans = calcPow(x, y);
        // System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        int ans = calcPow(x, y);
        System.out.println(ans);

    }
}
