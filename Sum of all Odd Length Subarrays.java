class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int l = 0 ;
        for ( int i = 0 ; i < arr.length ; i++ )
        {
            l = l + arr[i];
        }
        for ( int i = 0 ; i < arr.length ; i++ )
        {
            for ( int j = i+2 ; j < arr.length ; j = j +2 )
            {
                for ( int k = i ; k <= j ; k++ )
                {
                        l = l + arr[k];
                }
            }   
        }
        return l;
    }
}