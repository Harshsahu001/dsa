class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            if((i+1)%3==0 && (i+1)%5==0)
            {
                arr.add("FizzBuzz");
            }
            else if((i+1)%3==0){
                arr.add("Fizz");
            }
            else if((i+1)%5==0){
               arr.add("Buzz");
            }
            else{
                String A=Integer.toString(i+1);
                arr.add(A);
            }
        }
        return arr;
    }
}