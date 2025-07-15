class Solution {
    public int dominantIndex(int[] nums) {
        int maxVal = -1, maxIndex = -1, secondMaxVal = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                secondMaxVal = maxVal;
                maxVal = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMaxVal) {
                secondMaxVal = nums[i];
            }
        }
        if (maxVal >= 2 * secondMaxVal) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}