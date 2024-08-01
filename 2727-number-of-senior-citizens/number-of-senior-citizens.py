class Solution:
    def countSeniors(self, details: List[str]) -> int:
        c = 0
        for i in details:
            n = int(i[11:13])
            if n > 60:
                c += 1
        return c
        