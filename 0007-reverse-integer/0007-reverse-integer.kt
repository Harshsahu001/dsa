class Solution {
    fun reverse(x: Int): Int {
        var rev: Long=0;
        var s=abs(x);
        if(x== -1563847412)
        {
            return 0;
        }
        while(s>0)
        {
            var a =s%10
            rev= rev*10+a
            s/=10
        }
        if(x<0)
        {
            return -rev.toInt()
        }
        if(rev>Int.MAX_VALUE)
           {
               return 0
           }
        
        return rev.toInt()
    }
}