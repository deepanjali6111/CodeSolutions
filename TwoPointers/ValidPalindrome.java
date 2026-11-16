package TwoPointers;

/*Leetcode problem 125. Valid Plaindrome */

class Solution {
    public boolean isPalindrome(String s) {

        // Remove all non-alphanumeric characters
        String temp = s.replaceAll("[^A-Za-z0-9]", "");

        // Convert the string to lowercase
        temp = temp.toLowerCase();

        int l = 0;
        int r = temp.length() - 1;

        while (l < r) {

            if (temp.charAt(l) != temp.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }

        return true;
    }
}
