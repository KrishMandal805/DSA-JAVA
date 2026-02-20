public class Occurance {
    
    //declared frist by static 
     public static int first = -1;
     public static int last = -1;
 

   //Created recursive function
    public static void findOccurance(String str,int idx,char Element){
       if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
       }
       
        char currchar = str.charAt(idx);//Taking out current character
        if(currchar == Element){
            if(first == -1){
                first = idx;//yedi first -1 xa vane first = idc(index) print gardinr
        
            }else{
                last = idx;
            }

        
        }
           findOccurance(str,idx+1,Element);

    }
    public static void main(String args[]){
        String str = "adfjhfjhfsahljaaa";
        findOccurance(str, 0, 'a');

    }
}
