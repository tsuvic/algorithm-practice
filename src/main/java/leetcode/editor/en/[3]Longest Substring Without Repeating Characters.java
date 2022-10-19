//Given a string s, find the length of the longest substring without repeating 
//characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s consists of English letters, digits, symbols and spaces. 
// 
//
// Related Topics Hash Table String Sliding Window 👍 29004 👎 1236


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {

       /*
        Approach 1
        */

//        int n = s.length();
//        int res = 0;
//
//        for (int i = 0; i < n; i++){
//            for (int j = i; j < n; j++){
//                if (checkRepetition(s, i, j)){
//                    res = Math.max(res, j - i + 1);
//                }
//            }
//        }
//        return res;
//    }
//
//    private boolean checkRepetition(String s, int start, int end){
//        Set<Character> chars = new HashSet<>();
//
//        for (int i = start; i <= end; i++){
//            char c = s.charAt(i);
//            if (chars.contains(c)){
//                return false;
//            }
//            chars.add(c);
//        }
//        return true;

        /*
        Approach 2
         */

//        Map<Character, Integer> chars = new HashMap();
//        int left = 0;
//        int right = 0;
//        int res = 0;
//
//        while (right < s.length()){
//            char r = s.charAt(right);
//            chars.put(r, chars.getOrDefault(r, 0) + 1);
//
//            while (chars.get(r) > 1){
//                char l = s.charAt(left);
//                chars.put(l, chars.get(l) - 1);
//                left++;
//            }
//
//            res = Math.max(res, right - left + 1);
//            right++;
//
//        }
//
//        return res;

        /*
        Approach 3
         */

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < n; j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

    }
}

//leetcode submit region end(Prohibit modification and deletion)
