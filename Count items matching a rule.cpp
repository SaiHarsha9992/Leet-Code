class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int c = 0;
        for(int i = 0; i < items.size(); i++){
            if (ruleKey=="type"){
                if(items[i][0]==ruleValue){
                    c += 1;
                }
            }
            if (ruleKey=="color"){
                if(items[i][1]==ruleValue){
                    c += 1;
                }
            }
            if (ruleKey=="name"){
                if(items[i][2]==ruleValue){
                    c += 1;
                }
            }
        }
        return c;
    }
};