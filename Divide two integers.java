class Solution {
    public int divide(long dividend, long divisor) {
        if (dividend / divisor > Math.pow(2,31) - 1)
        {
            return((int)Math.pow(2,31));
        }
        else
        {
            return (int)(dividend/divisor);
        }
    }
}