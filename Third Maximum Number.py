class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        c,n=1,len(nums)
        m=nums[0]
        for i in range(1,n):
            if nums[i]<m:
                c+=1
                m=nums[i]
            if c==3:
                return m
        return nums[0]
        
