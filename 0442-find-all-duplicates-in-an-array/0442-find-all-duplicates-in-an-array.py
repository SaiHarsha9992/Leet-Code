class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        setn = set()
        a = []
        for i in nums:
            if i in setn:
                a.append(i)
            else:
                setn.add(i)
        return a
        