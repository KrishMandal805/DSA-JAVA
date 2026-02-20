import java.util.*;

public class Length {

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

    int size=sc.nextInt();

    String array[]= new  String[size];

    int totallength=0;

    for(int i=0; i<size; i++){

        array[i]= sc.next();

        totallength += array[i].length();


    }

    System.out.println(totallength);

}
    
}
