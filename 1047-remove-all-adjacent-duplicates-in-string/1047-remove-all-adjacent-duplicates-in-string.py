class Solution:
    def removeDuplicates(self, s: str) -> str:
        st = []
        for i in s:
            if not st or i != st[-1]:
                st.append(i)
            else:
                st.pop()
        return "".join(st)
        