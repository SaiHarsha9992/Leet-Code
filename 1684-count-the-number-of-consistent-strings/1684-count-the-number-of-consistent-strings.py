class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0
        for i in words:
            c = 0
            for j in i:
                if j in allowed:
                    c += 1
            if c == len(i):
                count += 1
        return count
        