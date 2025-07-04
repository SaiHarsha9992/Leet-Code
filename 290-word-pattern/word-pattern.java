class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> hashMap = new HashMap<>();
        String[] stringArray = s.split(" ");
        if (pattern.length() != stringArray.length) return false;
        for (int i = 0; i < pattern.length(); i++){
            if (!hashMap.containsKey(pattern.charAt(i))){
                if (hashMap.containsValue(stringArray[i])){
                    return false;
                }
                hashMap.put(pattern.charAt(i), stringArray[i]);
            } else {
                if (!hashMap.get(pattern.charAt(i)).equals(stringArray[i])){ 
                    return false;
                }
            }
        }
        return true;
    }
}