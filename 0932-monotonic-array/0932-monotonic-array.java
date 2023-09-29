class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int j=1;
        int i;
        int ci=0;
        int c1=0;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]>=nums[j])
            {
                 ci++;
            }
            if(nums[i]<=nums[j])
            {
                c1++;
            }
            j++;
        }
        if(c1==n-1)
        {
            return true;
        }
        if(ci==n-1)
        {
            return true;
        }
        return false;
    }
}