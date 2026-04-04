class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char arr[] = s.toCharArray(); //convert the string to array
            Arrays.sort(arr);  //sort the arr
            String newKey = new String(arr); //convert the sorted array to string

            map.putIfAbsent(newKey, new ArrayList());
            map.get(newKey).add(s);

        }
        return new ArrayList<>(map.values());
    }
}


//TC: O(n * k log k), where n is the number of strings in strs and k is the average length of the strings (due to sorting each string)
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