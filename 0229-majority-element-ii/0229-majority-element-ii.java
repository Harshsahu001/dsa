class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        n = n / 3;
        List<Integer> arr= new ArrayList();
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() > n) {
                arr.add(mp.getKey());
            }
        }
        return arr;
    }
    }