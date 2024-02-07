class Solution:
    def reverseWords(self, s: str) -> str:
        result = ""
        arr = s.split(" ")
        for i in arr:
            result += i[::-1]+" "
        return result[0:len(s)]
        