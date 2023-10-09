class Solution {
    public int[] searchRange(int[] nums, int target) {
        PriorityQueue<Integer> que= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                que.add(i);
            }
        }
        if(que.isEmpty())
        return new int[]{-1,-1};

        int[] res = new int[2];
        res[0] = que.peek();
        while (!que.isEmpty())
        {
        res[1] = que.poll();
        }

        return res;
    }
}