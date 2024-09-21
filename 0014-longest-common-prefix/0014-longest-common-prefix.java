class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String ans = "";
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i]; 
            int n = s.length();
            int m = temp.length();
            int j = 0;
            while (j < n && j < m && temp.charAt(j) == s.charAt(j)) {
                j++;
            }
            temp=temp.substring(0,j);
            if (temp.isEmpty())
                return "";
        }

        return temp;
    }
}