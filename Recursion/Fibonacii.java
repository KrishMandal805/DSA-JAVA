public class Fibonacii {
      public static void printNumb(int a, int b, int n){

        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printNumb(b,c,n-1);

      }

    public static void main(String aargs[]){
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=9;
        printNumb(a,b,n-2);

    }
    
}
