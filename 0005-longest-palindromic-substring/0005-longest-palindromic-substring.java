class Solution {
    public String longestPalindrome(String s) {
        int n =s.length();
        int max_leng=0;
        int si=-1;
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
              if(solve(s,i,j)==true)
              {
                if(max_leng<j-i+1)
                {
                    max_leng=j-i+1;
                    si=i;
                }
              }
            }
        }
        return s.substring(si,si+max_leng);
    }
    public boolean solve(String s, int i, int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)==s.charAt(j))
        {
            return solve(s,i+1,j-1);
        }
        return false;
    }
}