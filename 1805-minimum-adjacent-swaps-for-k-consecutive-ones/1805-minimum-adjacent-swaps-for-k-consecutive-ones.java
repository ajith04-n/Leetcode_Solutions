class Solution {
    public int minMoves(int[] a, int k) {
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < a.length; i++) if (a[i] == 1) p.add(i - p.size());
        int n = p.size();
        long[] s = new long[n + 1];
        for (int i = 0; i < n; i++) s[i + 1] = s[i] + p.get(i);
        long r = Long.MAX_VALUE;
        for (int i = 0; i + k <= n; i++) {
            int m = i + k / 2;
            long x = p.get(m);
            long l = x * (m - i) - (s[m] - s[i]);
            long y = (s[i + k] - s[m + 1]) - x * (i + k - m - 1);
            r = Math.min(r, l + y);
        }
        return (int) r;
    }
}