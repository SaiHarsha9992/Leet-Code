class Solution {
public:
    vector<int> NSE(vector<int>&nums){
        stack<int>st;
        int n = nums.size();
        vector<int> nse(n,0);
        for(int i = n-1;i>=0;i--){
            while(!st.empty() && nums[st.top()] >= nums[i]){
                st.pop();
            }
            if(st.empty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.top();
            }
            st.push(i);
        }
        return nse;
    }
    vector<int> PSEE(vector<int>&nums){
        stack<int> st;
        int n = nums.size();
        vector<int> pse(n,0);
        for(int i=0 ;i<n;i++){
            while(!st.empty() && nums[st.top()] > nums[i]) st.pop();
            if(st.empty()) pse[i] =  -1;
            else pse[i] = st.top();
            st.push(i);
        }
        return pse;
    }
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        vector<int> nse = NSE(heights);
        vector<int> pse = PSEE(heights);
        int maxi = 0;
        for(int i = 0; i < n; i++){

            maxi = max(maxi, heights[i] * (nse[i]-pse[i]-1));
        }
        return maxi;
    }
};