class Solution {
    public String sortVowels(String s) {
        String con ="";
        String vow= "";
        for(int i=0;i<s.length();i++)
        {
           if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1)
            {
               con+=s.charAt(i);
            }
            else{
                 vow+=s.charAt(i);
                
            }
        }
        char [] arr= vow.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        String res="";
        int j=0;
        int k=0;
        while(j<s.length())
        {
            if ("aeiouAEIOU".indexOf(s.charAt(j)) == -1)
            {
                 res+=s.charAt(j);
            }
            else{
                res+=arr[k];
                k++;
            }
            j++;
            
        }
        return res;
    }
}