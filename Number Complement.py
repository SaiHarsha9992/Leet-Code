class Solution:
    def findComplement(self, n: int) -> int:
        x=""
        for i in bin(n)[2:]:
            if i=="1":
                x+="0"
            else:
                x+="1"
        return int(x,2)
        
