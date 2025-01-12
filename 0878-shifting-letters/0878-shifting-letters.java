class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int c = 0;
        for (int i = n - 1; i >= 0; i--) 
        {
            c = (c + shifts[i]) % 26;
            arr[i] = (char) ('a' + (arr[i] - 'a' + c) % 26);
        }
        return new String(arr);
    }
}