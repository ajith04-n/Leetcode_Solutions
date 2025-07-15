class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rowBox = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rowBox[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = false;
        for (char letter : s.toCharArray()) {
            rowBox[row].append(letter);
            if (row == 0 || row == numRows - 1) {
                down = !down;
            }
            row += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder eachRow : rowBox) {
            result.append(eachRow);
        }
        return result.toString();
    }
}