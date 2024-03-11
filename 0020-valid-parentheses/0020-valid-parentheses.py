class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch == '(' or ch == '{' or ch == '[':
                stack.append(ch)
            else:
                if stack:
                    if ch == ')' and stack[-1] == '(':
                        stack.pop()
                    elif ch == '}' and stack[-1] == '{':
                        stack.pop()
                    elif ch == ']' and stack[-1] == '[':
                        stack.pop()
                    else:
                        return False
                else:
                    return False
        
        return len(stack) == 0