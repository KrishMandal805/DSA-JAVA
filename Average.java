import java.util.*;

public class Average {
    
public static void printAverage(int n){
      System.out.print(n);
    
}


public static void main(String args[]){
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter three numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
     int Average = (a+b+c)/3;
    
    printAverage(Average);
}


}
