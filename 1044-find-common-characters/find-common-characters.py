class Solution:
    def foundfreq(self,str):
        d = {}
        for i in str:
            d[i] = d.get(i,0) + 1
        return d
    def commonChars(self, words: List[str]) -> List[str]:
        dl = []
        for i in words:
            dl.append(self.foundfreq(i))
        print(dl)

        res = []

        for i in words[0]:
            c = 0
            for j in dl:
                t = j.get(i,0)
                if t > 0:
                    j[i] -= 1
                    c+=1
            if c == len(dl):
                res.append(i)

        return res 
        