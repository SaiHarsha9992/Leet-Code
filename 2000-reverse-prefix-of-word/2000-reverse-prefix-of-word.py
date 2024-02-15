class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        ind = word.find(ch)
        if ch == -1:
            return word
        return word[:ind+1][::-1] + word[ind+1:]
        