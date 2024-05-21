class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        count = len(nums)//3
        ans = []
        hashmap = {}
        for n in nums:
            hashmap[n] = 1 + hashmap.get(n, 0)
        for key in hashmap:
            if hashmap[key] > count:
                ans.append(key)
        return ans
        