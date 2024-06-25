class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        a = []
        for i in range(len(nums)//2):
            a.append((min(nums)+max(nums))/2)
            nums.remove(min(nums))
            nums.remove(max(nums))
        return min(a)
            
        