class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int alp[] = new int[26];
            for(char c : s.toCharArray()) {
                alp[c - 'a']++;
            }
            String key = Arrays.toString(alp);

            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}


//TC: O(n * k), where n is the number of strings in strs and k is the average length of the strings (due to counting frequencies for each string)
//SC: O(n * k), where n is the number of strings and k is the average string length (for storing the strings in the map and lists)


//Example 1:
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Explanation:
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

//Example 2:
//Input: strs = [""]
//Output: [[""]]

//Example 3:
//Input: strs = ["a"]
//Output: [["a"]]