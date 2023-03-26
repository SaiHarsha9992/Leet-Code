class Solution {
public:
    int countDigits(int num) {
        int t = num , c = 0 , r ;
        if ( num < 10 )
        {
            return 1 ;
        }
        else
        {
            while ( t > 0 )
            {
                r = t % 10 ;
                if ( num % r == 0 )
                {
                    c += 1 ;
                } 
                t /= 10 ;
            }
        }
        return c ;
    }
};