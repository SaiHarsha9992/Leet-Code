class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        arr = heights.copy()
        print(arr)
        heights.sort()
        print(heights)
        c = 0
        for i in range(len(arr)):
            if arr[i] != heights[i]:
                c += 1
            
            
        return c