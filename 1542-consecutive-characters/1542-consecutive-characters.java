class Solution {
    public int maxPower(String s) {
     int i=0;
     int curr=1;
     int max=1;
     for(i=0;i<s.length()-1;i++)
     {
        if(s.charAt(i)==s.charAt(i+1))
        {
            curr++;
        }
        else{
            max=Math.max(curr,max);
            curr=1;
        }
     }
       
     return Math.max(max,curr);
    }
}