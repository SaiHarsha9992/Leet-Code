class Solution {
    private String s;
    private String t;
    public boolean dp(int i, int j) {
        if (i == s.length()) {
            return true;
        }
        if (j == t.length()) {
            return false;
        }
        if (s.charAt(i) == t.charAt(j)){
            return dp(i + 1, j + 1);
        } else {
            return dp(i, j + 1);
        }
    }
    public boolean isSubsequence(String s, String t) {
        this.s = s;
        this.t = t;
        return dp(0, 0);
    }
}