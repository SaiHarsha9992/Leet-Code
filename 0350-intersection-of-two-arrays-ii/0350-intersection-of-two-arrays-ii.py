class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        counts = dict(Counter(nums1))
        inter = []
        for i in nums2 :
            if i in counts :
                if counts[i] > 0 :
                    inter.append(i)
                    counts[i] -= 1
        return inter
        