class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        li = []
        for i in range(left,right+1):
            s = int(math.log10(i)+1)
            temp = i
            c = 0
            while(temp!=0):
                r = temp%10
                if(r!=0 and i%r==0):
                    c+=1
                temp=temp//10
            
            if c == s:
                li.append(i)


        return li
