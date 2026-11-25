class Solution {
    public int[][] kClosest(int[][] points, int K) {
       PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
       for (int[] point : points) {
        int dist = point[0] * point[0] + point[1] * point[1];
        minHeap.offer(new int[]{dist, point[0], point[1]});
       }
       int[][] result = new int[K][2];
       for (int i = 0; i < K; ++i) {
        int[] point = minHeap.poll();
        result[i] = new int[]{point[1], point[2]};
       }
       return result;

    }
    // time: O(n + k * logn) when building the heap wiht heapify, 
    // or O(n * logn + k * logn) when inserting each point with a heap push
    // space: O(n) where n is the lenth of the array points
}
