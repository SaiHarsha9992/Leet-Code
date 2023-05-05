class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0 , p = 0 ;
       for ( int i = 0 ; i < nums.length ; i++ )
       {
           if ( nums[i] == 1 )
           {
               c++;
               if ( c > p )
               {
                   p = c ;
               }
           }
           else
           {
               c = 0;
           }
       } 
       return p;
    }
}