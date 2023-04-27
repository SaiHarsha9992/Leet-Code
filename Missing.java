class Missing {
    public int missingNumber(int[] nums) {
        int c = 0 ;
        Arrays.sort(nums);
        for ( int i = 0 ; i < nums.length ; i++ )
        {
            if ( nums.length != nums[i])
            {
                c = 0 ;
            }
            
        }
    }
}