class Solution {
    public String restoreString(String s, int[] indices) {
        int n= indices.length;
        Character [] arr =new Character[n];
        int k;
        for(int i=0;i<n;i++)
        {
            k=indices[i];
            arr[k]=s.charAt(i);
        }
        String temp="";
        for(int j=0;j<n;j++)
        {
            temp+=arr[j];
        }
        return temp;
    }
}