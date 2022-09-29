package leetcode.editor.en;//Given an integer x, return true if x is palindrome integer.
//
// An integer is a palindrome when it reads the same backward as forward. 
//
// 
// For example, 121 is a palindrome while 123 is not. 
// 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it 
//becomes 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string?
//
// Related Topics Math 👍 7200 👎 2299


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0 || (x % 10 == 0 && x != 0)){
           return false;
       }

       int revertedNumber = 0;
       while(x > revertedNumber){
           revertedNumber = x % 10 + revertedNumber * 10;
           x /= 10;
       }
       //回文数が偶数の場合は完全一致、奇数の場合は最終的に10で割った数が一致
       return x == revertedNumber || x == revertedNumber / 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
