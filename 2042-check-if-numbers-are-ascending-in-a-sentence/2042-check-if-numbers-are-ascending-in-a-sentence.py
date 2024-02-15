class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        d = []
        s = s.split()

        for i in range(len(s)):
            if s[i].isdigit() == True:
                d.append(int(s[i]))

        dd = sorted(d)

        return d == dd and len(set(d)) == len(d)
                    
                
                
        