class Solution:
    def toHex(self, num: int) -> str:
        if num == 0:
            return '0'
        if num > 0:
            n = hex(num)
            s = str(n)
            return s[2:len(s)]
        else:
            num += 2**32
            n = hex(num)
            s = str(n)
            return s[2:len(s)]
