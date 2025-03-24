class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        if not meetings:
            return days 
        
        meetings.sort()
        
        merged_meetings = []
        start, end = meetings[0]
        
        for i in range(1, len(meetings)):
            next_start, next_end = meetings[i]
            if next_start <= end: 
                end = max(end, next_end)
            else:
                merged_meetings.append((start, end))
                start, end = next_start, next_end
        merged_meetings.append((start, end)) 
        
        # Step 3: Calculate available days
        busy_days = sum(end - start + 1 for start, end in merged_meetings)
        return days - busy_days
        