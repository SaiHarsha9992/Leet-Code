class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        boolean flag = false;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].startsWith(pref)){
                flag = true;
                c+=1;
            }
        }
        if(flag == true){
            return c;
        }
        else{
            return 0;
        }
    }
}