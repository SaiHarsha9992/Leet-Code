class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> v;
        int t = 0 , c = 0;
        for(int i = 0; i <= n ; i++){
            c = 0;
            t = i;
            while(t!=0){
                c += t%2;
                t = t/2;
            }
            v.push_back(c);
            
        }
        return v;
    }
};