class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector <int> v (2*nums.size()) ;
        int k = 0 ;
        for ( int i = 0 ; i < nums . size () ; i++ )
        {
            v [ i ] = nums [ i ] ;
            v [ i + nums.size()] = nums [ i ] ;
        }
        return v ;
    }
};