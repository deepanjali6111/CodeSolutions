package TwoPointers;
/*LeetCode Problem: 11.Container with most water */

class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {

            int currArea = Math.min(height[l], height[r]) * (r - l);

            max = Math.max(max, currArea);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
