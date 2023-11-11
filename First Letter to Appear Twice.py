class Solution:
    def repeatedCharacter(self, s: str) -> str:
        a = []
        for c in s:
            if c not in a:
                a.append(c)
            else:
                return c
