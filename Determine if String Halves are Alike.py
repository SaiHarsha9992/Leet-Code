class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        length = len(s)//2
        k = s[:length:]
        l = s[length:len(s):]
        o = 'aeiouAEIOU'
        fs = 0
        ss = 0
        for i in k:
            if i in o:
                fs += 1
        for j in l:
            if j in o:
                ss += 1
        return ss == fs
