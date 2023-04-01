class Solution {
    public int findNumbers(int[] nums) {
        int t , c , l = 0 ;
        for ( int i = 0 ; i < nums.length ; i++ )
        {
            t = nums[i];
            c = 0 ;
            while ( t!=0 )
            {
               t = t / 10 ;
               c++;
            }
            if ( c % 2 == 0 )
            {
                l++;
            }
        }
        return l ;
    }
}