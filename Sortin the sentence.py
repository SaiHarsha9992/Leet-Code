class Solution:
    def sortSentence(self, s: str) -> str:
        l = s.split(" ")
        arr = [0]*len(l)
        for i in l:
            n = int(i[-1])
            arr[n-1]=i[0:-1]
        return ' '.join(arr)


        
