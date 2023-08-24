class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words=sentence.split("\\s");
        int c = 0;
        boolean flag = false;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].startsWith(searchWord)){
                c = i;
                flag = true;
                break;
            }
        }
        if(flag == true){
            return c+1;
        }
        else{
            return -1;
        }
    }
}