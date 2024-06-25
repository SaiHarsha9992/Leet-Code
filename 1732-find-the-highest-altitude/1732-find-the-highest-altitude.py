class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        a = [0]
        for i in range(len(gain)):
            a.append((a[-1]+gain[i]))
        return max(a)