class Solution {
public:
    string removeKdigits(string num, int k) {
        stack<char> st;
        int n = num.length();
        
    
        for (int i = 0; i < n; i++) {
            while (!st.empty() && k > 0 && st.top() > num[i]) {
                st.pop();
                k -= 1;
            }
            st.push(num[i]);
        }
        
        while (k > 0 && !st.empty()) {
            st.pop();
            k -= 1;
        }
        string res = "";
        while (!st.empty()) {
            res += st.top();
            st.pop();
        }
        
        reverse(res.begin(), res.end());
        
        while (res.length() != 0 && res[0] == '0') {
            res.erase(res.begin());
        }
        
        return res.empty() ? "0" : res;
    }
};
