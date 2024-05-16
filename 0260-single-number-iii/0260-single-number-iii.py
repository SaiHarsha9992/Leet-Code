class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        d=dict()
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        res=[None,None]
        idx=0
        for i in d:
            if idx==2:
                break
            if d[i]==1:
                res[idx]=i
                idx+=1
        return res
        