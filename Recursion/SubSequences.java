//prrint subsequences of string 
//A subsequence is a sequence formed by taking some characters from a string (or elements from an array) without changing their order, but you are allowed to skip elements.
//kunai pni number auuna sakxa aafno mann le deko string bata
public class SubSequences {
   
  
    public static void subsequences(String str, int idx, String newstring){
     if(idx==str.length()){
        System.out.println(newstring);
        return;

     }
    
    char currChar= str.charAt(idx);

  //to be 
  subsequences(str, idx+1, newstring+currChar);

  //not to be
  subsequences(str, idx+1, newstring);


    }

    public static void main(String args[]){
        String str="abc";
        subsequences(str, 0, "");
 

    }
    
}
