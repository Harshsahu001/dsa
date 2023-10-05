class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],0);
            }
        }
        List<Integer> arr= new ArrayList<>();
         int n=nums.length;
         n/=3;
        for(Map.Entry<Integer,Integer> entry :map.entrySet())
        {
            int v= entry.getValue();
            if(v>=n)
            {
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}