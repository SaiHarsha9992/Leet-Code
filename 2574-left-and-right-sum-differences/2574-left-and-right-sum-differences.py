class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        rsum = 0
        lsum = 0
        rsumarr = []
        lsumarr = []
        rsumarr.append(0)
        lsumarr.append(0)
        for i in nums:
            rsum += i
            rsumarr.append(rsum)
        nums = nums[::-1]
        for i in nums:
            lsum += i
            lsumarr.append(lsum)
        lsumarr = lsumarr[:len(nums)]
        rsumarr = rsumarr[:len(nums)]
        lsumarr = lsumarr[::-1]
        result = []
        for i in range(len(lsumarr)):
            result.append(abs(rsumarr[i]-lsumarr[i]))
        return result