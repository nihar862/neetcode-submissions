class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>(); //O(n)
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); //O(log k)
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(new int[] {entry.getKey(), entry.getValue()});
            if (pq.size() > k) {
                pq.poll();
            }
        } //(n log k)

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }
        // (k log k)

        return result;
    }
}

// TC : O(n) + (n log k) + O(k log k) == O(n log k)
// SC : O(n) + O(k) + O(k) == O(n)
