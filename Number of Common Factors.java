class Solution {
    public int commonFactors(int a, int b) {
        int c = 0 ;
        for ( int  i = 1 ; i <= b ; i++ )
        {
            if ( a % i == 0 && b % i == 0 )
            {
                c += 1 ;
            }
            
        }
        return c ;
    }
}