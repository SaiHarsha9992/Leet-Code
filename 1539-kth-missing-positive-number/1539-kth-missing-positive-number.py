class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        c = []
        for i in range(1,max(arr)+k+1):
            if i not in arr:
                c.append(i)        
        return c[k-1]
            
        