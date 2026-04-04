class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char cs : s.toCharArray()) {
            map.put(cs, map.getOrDefault(cs, 0) + 1);
        }
        for(char ct : t.toCharArray()) {
            if(!map.contains(ct) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }
        return true;

    }
}


//TC : O(n + m)
//SC : O(1)

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:
//Input: s = "rat", t = "car"
//Output: false

//Constraints:
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.

//Follow up: What if the inputs contain Unicode characters?
// How would you adapt your solution to such a case?