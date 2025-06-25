import java.util.*;
public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            result += (value < prevValue) ? -value : value;
            prevValue = value;
        }
        return result;
    }
    public List<Integer> convertManyRomans(List<String> romanList) {
        List<Integer> resultList = new ArrayList<>();
        for (String roman : romanList) {
            resultList.add(romanToInt(roman.toUpperCase()));
        }
        return resultList;
    }
}
