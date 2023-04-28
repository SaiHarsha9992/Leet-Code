class Solution {
    public int smallestEvenMultiple(int n) {
        if ( n % 2 == 0 )
        {
            return n;
        }
        else
        {
            int s = 2 * n;
            return s; 
        }
    }
}