class Solution:
    def getLucky(self, s: str, k: int) -> int:
        res=""
        for i in s:
            n=ord(i)-96
            res+=str(n)
        for i in range(k):
            s=0
            for i in res:
                s+=int(i)
            res=str(s)
        return s 
        