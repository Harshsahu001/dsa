class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        int [][] array = new int[map.size()][2]; 
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            array[j][0] = entry.getValue();
            array[j][1] = entry.getKey();
            j++;
        }
        Arrays.sort(array, (a, b) -> Integer.compare(b[0], a[0]));
        int [] arr= new int[k];
        int q=0;
        while(k!=0)
        {
            arr[q]=array[q][1];
            q++;
            k--;
        }
        for (int i = 0; i < array.length; i++) {
        for (int l = 0; l < array[i].length; l++) {
        System.out.print(array[i][l] + " ");
                                                   }
        System.out.println(); 
        }
        return arr;
}}