class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size())
               return false;

       vector<int> freq1(26,0);
       vector<int> freq2(26,0);

     for(int i=0;i<t.size()&& i<s.size();i++)
       {
         freq2[t[i]-'a']++;
         freq1[s[i]-'a']++;
       }  

       if(freq1==freq2)
           return true;

           return false;
    }
};