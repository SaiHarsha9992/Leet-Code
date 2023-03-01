class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = nums . size ( ) ;
        sort ( nums . begin ( ) , nums . end () ) ;
        int k = nums [ n - 1 ] , c = 0 ;
        for ( int i = 0 ; i < n - 1  ; i++ )
        {
            if (nums [ i ] == nums [ i + 1 ] )
            {
                c++ ;
            }
            else if ( nums [ i ] != nums [ i + 1 ] && c == 0 ) 
            {
                k = nums [ i ] ;
            }
            else
            {
                c = 0 ;
            }
        }
        return  k ;
    }
};