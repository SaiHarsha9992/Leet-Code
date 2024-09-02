class Solution:
    def longestCommonPrefix(self, v: List[str]) -> str:
        v=sorted(v)
        first=v[0]
        last=v[-1]
        ans = ""
        for i in range(min(len(first),len(last))):
            if(first[i]!=last[i]):
                return ans
            ans+=first[i]
        return ans 

        