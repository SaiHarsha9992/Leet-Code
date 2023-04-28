class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        String m = "";
        for (int i = 0 ; i < word1.length ; i++ )
        {
            s = s + word1[i];
        }
        for (int i = 0 ; i < word2.length ; i++ )
        {
            m = m + word2[i];
        }
         
        if ( s.equals(m))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}