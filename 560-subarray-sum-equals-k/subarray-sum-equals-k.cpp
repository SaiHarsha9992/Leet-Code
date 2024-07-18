class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int ans_count = 0;
        unordered_map<int,int> mpp;
        int currsum = 0;
        
        for(int a : nums){
            currsum += a;
            if(currsum == k){
                ans_count++;
            }
            if(mpp.find(currsum-k) != mpp.end()){ 
                ans_count+=mpp[currsum-k]; 
            }
            mpp[currsum]++;
        }
        
        return ans_count;
    }
};