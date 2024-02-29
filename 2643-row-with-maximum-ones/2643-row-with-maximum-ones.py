class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        res=[]
        ans=[]
        for i in mat:
            res.append(i.count(1))
        ans.append(res.index(max(res)))
        ans.append(max(res))
        return ans
        