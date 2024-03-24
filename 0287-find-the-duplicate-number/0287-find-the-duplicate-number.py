class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        setn = set()
        for i in nums:
            if i in setn:
                return i
            else:
                setn.add(i)
        
        