class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       for (int i = 0, ii = 0; i < nums1.length && ii < nums2.length; ) {
            if (nums1[i] < nums2[ii]) ++i;
            else if (nums1[i] == nums2[ii]) return nums1[i]; 
            else ++ii; 
        }
        return -1; 
    }
}