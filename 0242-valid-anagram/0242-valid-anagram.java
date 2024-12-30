class Solution {
    public boolean isAnagram(String s, String t) {
        char [] arr1= s.toLowerCase().toCharArray();
        char [] arr2= t.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}