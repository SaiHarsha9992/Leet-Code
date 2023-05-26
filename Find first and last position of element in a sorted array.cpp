class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector <int> v ;
        int c = 0 , d = 0;
        int flag = 0;
        for(int i = 0 ; i < nums.size(); i++)
        {
            if(nums[i]==target)
            {
                c = i;
                flag = 1;
                break;
            }
        }
        for(int j = nums.size()-1; j >= 0; j--)
        {
            if(nums[j]==target)
            {
                d = j;
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            v.push_back(-1);
            v.push_back(-1);
        }
        else
        {
            v.push_back(c);
            v.push_back(d);
        }
        return v;
    }
};