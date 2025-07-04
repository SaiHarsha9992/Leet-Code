class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxValue = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int seed = num;
                int length = 1;

                while (set.contains(seed + 1)) {
                    seed++;
                    length++;
                }
                maxValue = Math.max(maxValue, length);
            }
        }
        return maxValue;
    }
}