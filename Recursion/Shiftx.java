public class Shiftx {
     public static void moveAllX(String str,int idx, int count,String newstring){
        
       if (idx==str.length()) {
        for(int i=0;i<count;i++){
            newstring +='x';
        }
        System.out.println(newstring);
        return;
       }
       char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx+1, count, newstring);
            
        }else {
            newstring += currChar;
            moveAllX(str, idx+1, count, newstring);
        }
     }


    public static void main(String args[]){
     String str = "axbbxcdx";
     moveAllX(str, 0, 0, "");
    }
}
