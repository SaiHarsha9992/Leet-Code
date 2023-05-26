class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int c , flag = 0;
      for(int i = 0 ; i < nums.size() ; i++)
      {
          if(nums[i]==target)
          {
              c = i;
              flag = 1;
              break;
          }
      } 
      if(flag == 1)
      {
          return c;
      }
      else
      {
          int d;
          for(int i = 0 ; i < nums.size() ; i++)
          {
              if(nums[i]>target)
              {
                  d = i;
                  break;
              }
          }
          return d;      }
       
    }
};