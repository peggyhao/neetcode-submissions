class Solution {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);

        return index >= 0 ? index : -1;
    }

    // time: O(logn) space: O(1)
}
