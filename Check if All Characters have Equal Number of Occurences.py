class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        a = []
        for i in s:
            a.append(s.count(i))
        c = a[0]
        for i in a:
            if c != i:
                return False
        return True
