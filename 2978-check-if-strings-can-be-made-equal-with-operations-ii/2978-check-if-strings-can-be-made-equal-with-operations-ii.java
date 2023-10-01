class Solution {
    public boolean checkStrings(String s1, String s2) {
         List<Character> e1= new ArrayList<>();
         List<Character> o1= new ArrayList<>();
         List<Character> e2= new ArrayList<>();
         List<Character> o2= new ArrayList<>();
         if(s1.equals(s2))
         {
             return true;
         }
         for(int i=0;i<s1.length();i++)
         {
             if(i%2==0)
             {
                e1.add(s1.charAt(i));
                e2.add(s2.charAt(i));
             }
             o1.add(s1.charAt(i));
             o2.add(s2.charAt(i));
         }
         Collections.sort(e1);
         Collections.sort(e2);
         Collections.sort(o1);
         Collections.sort(o2);
         
         if(e1.equals(e2) && o1.equals(o2))
         {
            return true;
         }
         return false;
    }
}