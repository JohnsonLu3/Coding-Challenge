import java.io.IOException;
import java.util.Stack;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Difficulty Medium
 *
 * **/

public class main {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int temp = 0;
        Stack<Character> sub = new Stack<Character>();
        //O(N^n) apporach
        for(int i = 0; i < s.length(); i++){
            String scan = s.substring(i, s.length());
            for(char ch : scan.toCharArray()){
                //sub is empty
                if(sub.empty()){
                    temp++;
                    sub.push(ch);
                }else{
                    //check if repeated character
                    if(sub.search(ch) != -1){
                        break;
                    }else{
                        temp++;
                        sub.push(ch);
                    }
                }
            }
            if(max < temp){
                max = temp;
            }
            temp = 0;
            sub = new Stack<Character>();;
        }

        return max;
    }



    public static void main(String[] args) throws IOException {
        int max = lengthOfLongestSubstring("abcabcabc");

        System.out.println(max);
    }
}
