import java.util.*;
class Solution {
    public int countSegments(String s) {
        // StringTokenizer st = new StringTokenizer(s);
        // return st.countTokens();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
            ans++;
        }
        return ans;
    }
}