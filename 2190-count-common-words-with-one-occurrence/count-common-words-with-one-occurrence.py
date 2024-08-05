class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        c=0
        one=[]
        two=[]
        count=Counter(words1)
        count2=Counter(words2)
        for i in count:
            if count[i]<=1:
                one.append(i)
                
        for j in count2:
            if count2[j]<=1:
                two.append(j)

        for i in one:
            if i in two:
                c+=1
        return c
        