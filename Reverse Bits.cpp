class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        long s = 0;
        for(int i = 1 ; i <= 32 ; i++)
        {
            s <<= 1;
            s |= (n&1);
            n >>= 1;
        }
        return s;
    }
};