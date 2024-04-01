class Solution {
public:
    int lengthOfLastWord(string s) {
        int c = 0;
        int flag = 0;
        for(int i = s.length() ; i >=0 ; i--)
        {
            if(s[i]>='a'&&s[i]<='z'||s[i]>='A'&&s[i]<='Z')
            {
                flag = 1;
                c++;
            }
            else
            {
                if(flag==1)
                {
                    return c;
                }
            }
        }
        return c;
    }
};