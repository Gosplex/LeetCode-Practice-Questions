/*
 * Input: x = 121 ? Output: true, else Output: false
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * https://leetcode.com/problems/palindrome-number/
 */
class Solution {
    public boolean isPalindrome(int x) {
        boolean answer = true;
        int remainder;
        int reverse = 0;
        int temp = 0;
        temp = x;

        while (x > 0) {
            remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = (x / 10);
        }

        if (temp == reverse) {
            answer = true;
            return answer;
        } else {
            answer = false;
            System.out.println(reverse);
            return answer;
        }
    }
}