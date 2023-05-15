class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0 , k = 0 ;
        for ( int i = 0 ; i < nums.length ; i++)
        {
            if ( nums[i] != 0 )
            {
                nums[k++]=nums[i];
            }
            else
            {
                c++;
            }
        }
        while(c-- >0 )
        {
            nums[k++]=0;
        }
    }
}