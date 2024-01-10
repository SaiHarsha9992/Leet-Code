class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        s = nums[0]
        for i in range(1,len(nums)):
            if nums[i-1]+1==nums[i]:
                s += nums[i]
            else:
                break
        nums.sort()
        for i in range(len(nums)):
            if s not in nums:
                return s
            else:
                s += 1
        return nums[-1]+1
        
