class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        if len(s) < k:
            return s
        else:
            a = s.split()
            res = ''
            for i in range(k):
                if i == k-1:
                    res += a[i]
                else:
                    res = res + a[i] + ' '
            return res
        
