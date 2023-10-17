class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []arr = new int[2];
        int n= numbers.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            if(numbers[low]+numbers[high]<target)
            {
                low+=1;
            }
            else if(numbers[low]+numbers[high]>target)
            {
                high-=1;
            }
            else{
                arr[0]=low+1;
                arr[1]=high+1;
                return arr;
            }
        }

        return arr;
    }
}