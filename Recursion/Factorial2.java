public class Factorial2 {
    public static void printFactorial(int n, int fact) {
        
        if(n==0||n==1){
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n-1, fact);
    }
    
    public static void main(String args[]){
        printFactorial(5, 1);

    }
}
