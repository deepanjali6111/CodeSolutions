package TwoPointers;

/*Leetcode problem:42.Trapping rain water */

class Solution {
    public int trap(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int lm = 0;
        int rm = 0;
        int water = 0;

        while (l < r) {

            if (height[l] <= height[r]) {

                lm = Math.max(lm, height[l]);

                water += lm - height[l];

                l++;
            } else {

                rm = Math.max(rm, height[r]);

                water += rm - height[r];

                r--;
            }
        }

        return water;
    }
}
