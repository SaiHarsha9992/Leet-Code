class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        s = 0
        for i in nums:
            s ^= i
        l = k^s
        return bin(l).count('1')
