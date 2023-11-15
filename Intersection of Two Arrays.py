class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a = []
        for i in nums2:
            if i in nums1:
                a.append(i)
        l = []
        for j in a:
            if j not in l:
                l.append(j)
        return l
        
