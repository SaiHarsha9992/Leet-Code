class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(sum, 1);
        for (int x : nums){
            sum += x;
            int fnd = sum - k;
            if (map.containsKey(fnd)){
                ans += map.get(fnd);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}