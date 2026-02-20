import java.util.*;

public class Countone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number n");
        int n= sc.nextInt();

        int count=0;

        for(int num=n; num>0; num= num>>1){
            count = count+(num&1);
            
        }

        System.out.println("Number of 1s is:"+count);


    }
    
}
