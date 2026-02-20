import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ënter the number");
        int n = sc.nextInt();

        if(n>0&& (n& (n-1))==0){
            System.out.println("The number is power of two");
        }else{
            System.out.println("The number is not power of two");
        }


    }
    
}
