class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int n=s.length;
        int j=n-1;
        for(i=0;i<n/2;i++)
        {
            char ch=s[i];
            s[i]=s[j];
            s[j]=ch;
            j--;
        }
    }
}