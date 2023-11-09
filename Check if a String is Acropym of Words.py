class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        result = ''
        for i in words:
            result += i[0]
        return result == s
