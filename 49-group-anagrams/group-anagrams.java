class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!hashMap.containsKey(sorted)) {
                hashMap.put(sorted, new ArrayList<>());
            }
            hashMap.get(sorted).add(word);
        }
        List<List<String>> result = new ArrayList<>(hashMap.values());
        return result;
    }
}