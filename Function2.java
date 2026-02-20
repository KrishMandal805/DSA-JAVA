import java.util.*;

public class Function2 {
    public static int addTwoNumber (int sum){
    System.out.print(sum);
    return sum;
    }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int sum = a+b;

      addTwoNumber(sum);

     
    }

    
}
