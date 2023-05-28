class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0 , p = 1 , r;
        while(n!=0)
        {
            r = n % 10;
            s += r;
            p *= r;
            n = n / 10;
        }
        int k = (p-s);
        return k;
    }
}