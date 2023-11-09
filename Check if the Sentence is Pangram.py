class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        s = list(set(sentence))
        l = ''.join(s)
        c = 0
        k = 'qwertyuiopasdfghjklzxcvbnm'
        for i in l:
            if i in k:
                c += 1
        return True if c == 26 else False
        
