class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        c = 0
        for pattern in patterns: 
                if pattern in word: 
                     c+=1
        
        return c
