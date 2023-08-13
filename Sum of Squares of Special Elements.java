class Solution {
    public int sumOfSquares(int[] nums) {
        int s = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(n%(i+1)==0){
                s += Math.pow(nums[i],2);
            }
        }
        return s;
    }
}