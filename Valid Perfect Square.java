class Solution {
    public boolean isPerfectSquare(int num) {
        int s = (int) Math.sqrt(num);
        if ( s*s==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}