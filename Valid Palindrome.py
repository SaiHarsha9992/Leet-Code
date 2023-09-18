class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = ''
        for c in s.lower():
            if c.isalnum():
                s1 += c
        return s1==s1[::-1]
        
