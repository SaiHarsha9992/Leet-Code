class Solution {
    public void reverseString(char[] s) {
        char t ;
        int l = 0 , e = s. length-1;
        while ( l <= e )
        {
            if ( s [ l ] != s [ e ] ) 
            {
                t = s [ l ] ; 
                s [ l ] = s [ e ] ;
                s [ e ] = t ;
            }
            l++;
            e--;
        }
    }
}