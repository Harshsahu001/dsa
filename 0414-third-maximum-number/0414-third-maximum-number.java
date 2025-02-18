class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set= new TreeSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        List<Integer> arr= new ArrayList<>(set);
        if(set.size()<3)
        {
            return arr.get(arr.size() - 1);
        }
         return arr.get(arr.size() - 3);
    }
}