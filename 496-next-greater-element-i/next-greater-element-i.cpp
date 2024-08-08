class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int>res(nums1.size() , -1); 
        stack<int>stk; 
        map<int,int>mp; 
        for(int num : nums2){

            while(!stk.empty() and stk.top() < num){
                mp[stk.top()] = num;
                stk.pop();
            }

            stk.push(num);
        }
        for(int i = 0 ; i < nums1.size() ; i++){
            if(mp[nums1[i]]) 
                res[i] = mp[nums1[i]];
        }
        return res;
    }
};