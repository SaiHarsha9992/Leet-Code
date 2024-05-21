
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        di=defaultdict(int)
        m,c=0,0
        for i in nums:
            di[i]+=1
            if di[i]>m:
                m=di[i]
                c=0
            if di[i]==m:
                c+=1
        return m*c
        