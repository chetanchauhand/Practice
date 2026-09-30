public class Prints {
    public static void printNumb(int n){
        if(n == 10){
            return ;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n = 0;
        printNumb(n);
    }
}
