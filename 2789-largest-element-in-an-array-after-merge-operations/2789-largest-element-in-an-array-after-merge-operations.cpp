class Solution {
public:
    long long maxArrayValue(vector<int>& nums) {
        vector<long long>arr;
        for(int i: nums){
            arr.push_back(i);
        }
       int n=nums.size();
       reverse(arr.begin(), arr.end());
        for(int i=0; i<n-1; i++){
            if(arr[i]>=arr[i+1]){
                arr[i+1]=arr[i]+arr[i+1];
            }
        }
        return *max_element(arr.begin(), arr.end());
    }
};