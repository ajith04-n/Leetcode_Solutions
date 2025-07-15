import java.util.*;
class Solution {
    public int[] topKFrequent(int[] numbers, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>
        ((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];
        int index = 0;
        while (!heap.isEmpty()) {
            result[index] = heap.poll().getKey();
            index++;
        }
        return result;
    }
}