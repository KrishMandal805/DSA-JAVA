import java.util.*;
public class Togglle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n");
        int n = sc.nextInt();

        System.out.println("Enter pos");
        int pos = sc.nextInt();

        int result = n^(1<<pos);

        System.out.println(result);

    }
    
}
