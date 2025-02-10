class Solution:
    def clearDigits(self, s: str) -> str:
        result = []
        for ch in s:
            if "0" <= ch <= "9" and result:
                result.pop()
            else:
                result.append(ch)
        return "".join(result)