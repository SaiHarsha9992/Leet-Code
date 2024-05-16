class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        tmp = set()

        for i in arr:
            if 2*i in tmp or (i%2 == 0 and i/2 in tmp):
                return True
            tmp.add(i)
                
        