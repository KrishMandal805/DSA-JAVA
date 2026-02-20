public class AddNumber {
    public static void printNumb(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }

        
        sum+=i;
        printNumb(i+1,n,sum);

    }
    public static void main(String args[]){
     printNumb(1,5,0);
    }
    
}
