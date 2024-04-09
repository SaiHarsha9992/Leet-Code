class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        q = deque()
        t = 0

        for i in range(len(tickets)):
            q.append(i)

        while q:
            index = q.popleft()
            tickets[index] -= 1
            t += 1

            if tickets[index] == 0 and index == k:
                return t
            if tickets[index] > 0:
                q.append(index)

        return t
        