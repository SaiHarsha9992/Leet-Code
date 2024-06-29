class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        res = 0
        for i in range(len(students)):
            res += abs(max(students)-max(seats))
            seats.remove(max(seats))
            students.remove(max(students))
        return res
    
        