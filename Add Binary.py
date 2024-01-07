class Solution:
    def addBinary(self, a: str, b: str) -> str:
        first = int(a, 2 )
        second = int(b, 2)
        result = first+second
        return bin(result)[2:]
        
        
