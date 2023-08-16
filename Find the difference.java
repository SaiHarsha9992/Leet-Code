class Solution {
    public char findTheDifference(String s, String t) {
       int f[] = new int[26];
        for(char c : s.toCharArray())
            f[c - 'a']--;
        for(char c : t.toCharArray())
            f[c - 'a']++;
        int i = 0;
        for(; i < 26; i++)
            if(f[i] == 1) break;
        return (char)(i + 'a');
    }
}