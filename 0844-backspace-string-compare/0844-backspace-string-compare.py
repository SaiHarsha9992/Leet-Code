class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        final=False
        stack=[]
        second_stack=[]
        for i in range(len(s)):   
            if s[i]=='#' and stack:
                stack.pop()
            elif s[i]!='#':
                stack.append(s[i])
        for j in range(len(t)):             
            if t[j]=='#' and second_stack:
                second_stack.pop()
            elif t[j]!='#':
                second_stack.append(t[j])
        if stack==second_stack:             
            final=True
        return final
        