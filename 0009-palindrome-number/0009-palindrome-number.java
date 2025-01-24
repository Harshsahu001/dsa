class Solution {
    public boolean isPalindrome(int x) {
        // 
        String str= Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        boolean b= false;
        if (str.equals(reversed))
            b=true;
        
        return b;
    }
}