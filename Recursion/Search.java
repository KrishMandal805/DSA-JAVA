//code to find duplicates and remove them

public class Search {

    public static boolean[] map = new boolean[26]; // array declaration

    public static void removeDuplicates(String str, int idx, String newstring) {
        if (idx == str.length()) {// base case if index is equal to str.lenght then newstring will be printed
            System.out.println(newstring);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {// map= currchar-a

            removeDuplicates(str, idx + 1, newstring);
        } else {
            newstring += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstring);
        }

    }

    public static void main(String args[]) {
        String str = "abbcdeffggh";
        removeDuplicates(str, 0, "");

    }

}
