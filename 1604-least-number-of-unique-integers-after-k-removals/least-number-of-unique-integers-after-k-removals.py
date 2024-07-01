from collections import Counter

class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        if len(arr) == 1 and k == 1:
            return 0
        if k == 0:
            return len(set(arr))
        s = Counter(arr)
        l = s.most_common()
        a = []
        for item, value in l:
            for i in range(value):
                a.append(item)
        a = a[0:-k]
        return len(set(a))