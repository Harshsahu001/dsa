class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0; 
        if (haystack.length() < needle.length())
            return -1; 

        int n = needle.length();
        for (int i = 0; i <= haystack.length() - n; i++) 
        {
            String temp = haystack.substring(i, i + n);
            if (temp.equals(needle)) 
            {
                return i; 
            }
        }

        return -1;
    }
}