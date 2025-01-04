class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int a;
        int [] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            a=nums1[i];
            boolean found = false; 
            arr[i] = -1;
            for (int j = 0; j < nums2.length; j++) 
            {
                if (nums2[j] == a) 
                {
                    found = true;
                }
                else if (found && nums2[j] > a)
                {
                    arr[i] = nums2[j];
                    break;}
            }
        }
        return arr;
    }
}