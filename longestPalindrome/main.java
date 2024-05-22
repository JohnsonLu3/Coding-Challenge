public class main {
    public static String longestPalindrome(String s) {
        // expand around characters at i
        // check for both even and odd palidrome
        // compare the length of the two and then if its long then the recorded max then set that as max

        // Edge Case
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            //for every starting point
            int oddLen = expandAround(s, i ,i);
            int evenLen = expandAround(s,i, i+1);
            int len = 0;
            if(oddLen > evenLen){
                len = oddLen;
            }else{
                len = evenLen;
            }

            if(len > (end-start)){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandAround(String s, int left, int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        //calculate len
        return right-left-1;
    }

    public static void main(String args[]){
        System.out.println(longestPalindrome("babcbabbcabcabab"));
    }

}
