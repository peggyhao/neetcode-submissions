class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int res = 0, cnt = 0;
       for (int num : nums) {
        cnt = (num == 1) ? cnt + 1 : 0;
        res = Math.max(res, cnt); 
       } 
       return Math.max(res, cnt);
    }
    // Time: O(n) space: O(1)
}