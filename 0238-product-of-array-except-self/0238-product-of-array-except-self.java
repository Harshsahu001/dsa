class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pre= new int[n];
        int [] suff= new int[n];
        int [] arr= new int[n];
        int p=1;
        arr[0]=1;
        for(int i=1;i<n;i++)
        {
            p=p*nums[i-1];
            arr[i]=p;
        }
        p=1;
        for(int i=n-2;i>=0;i--)
        {
            p=p*nums[i+1];
            arr[i]=arr[i]*p;
        }
        return arr;
    }
}