class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        s = 0
        for i in nums:
            s = s^i
        return s
