class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int s = 0;
        if ( arrivalTime+delayedTime < 24 )
        {
            s = arrivalTime+delayedTime ;
        }
        else if ( arrivalTime+delayedTime  >= 24 )
        {
            s = arrivalTime+delayedTime -24;
        }
        return s;
    }
}