class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int days = temps.length;
        int[] answer = new int[days];
        Stack<Integer> pendingDays = new Stack<>();
        for (int today = 0; today < days; today++) {
            int currentTemp = temps[today];
            while (!pendingDays.isEmpty() && currentTemp > temps[pendingDays.peek()]) {
                int previousDay = pendingDays.pop();
                answer[previousDay] = today - previousDay;
            }
            pendingDays.push(today);
        }
        return answer;
    }
}