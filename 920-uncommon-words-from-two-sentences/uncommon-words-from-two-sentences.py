class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        ag = s1.split(' ')
        ag += (s2.split(' '))
        counter = Counter(ag)

        ans = []
        for s, cnt in counter.items():
            if cnt == 1:
                ans.append(s)
        return ans
        