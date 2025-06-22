class Solution:
    def divideString(self, s: str, k: int, fill: str) -> List[str]:
        result = []
        for i in range(0, len(s), k):
            chunk = s[i:i+k]
            if len(chunk) < k:
                chunk += fill * (k - len(chunk))
            result.append(chunk)
        return result

        