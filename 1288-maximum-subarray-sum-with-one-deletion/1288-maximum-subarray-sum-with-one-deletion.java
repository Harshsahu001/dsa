class Solution {
    public int maximumSum(int[] arr) {
        int n =arr.length;
        int i,res=-99999;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];
        for(i=1;i<n;i++)
        {
            prefix[i]=Math.max(arr[i],arr[i]+prefix[i-1]);
        }
        for(i=n-2;i>=0;i--)
        {
            suffix[i]=Math.max(arr[i],arr[i]+suffix[i+1]);
        }
        for(int j=0;j<n;j++)
        {
            res=Math.max(res,prefix[j]);
        }
        for(i=1;i<n-1;i++)
        {
            res=Math.max(res,prefix[i-1]+suffix[i+1]);
        }
        return res;
    }
}