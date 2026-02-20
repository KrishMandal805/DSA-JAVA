import java.util.*;

public class Spiral {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int m = sc.nextInt();

        int matrix [] [] = new int [n][m];

         for(int i=0; i<n; i++){

            for (int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();

            }
         }

         System.out.println("Spiral oder matrix is:");


         int rowstart=0;

         int rowend=n-1;

         int colsstart=0;

         int colsend=m-1;

         while(rowstart <= rowend && colsstart<=colsend){


            for(int col=colsstart; col<=colsend; col++){
                System.out.print(matrix[rowstart][col]+" ");

            }

            rowstart++;

            for(int row=rowstart; row<=rowend; row++){
                System.out.print(matrix[row][colsend]+" ");
            }

            colsend--;

            for(int col=colsend; col>=colsstart; col--){
                System.out.print(matrix[rowend][col]+" ");

            }

            rowend--;

             for(int row=rowend; row>=rowstart; row--){
                System.out.print(matrix[row][colsstart]+" ");
            }

            colsstart++;


            System.out.println();


         }
         

    }
    
}
