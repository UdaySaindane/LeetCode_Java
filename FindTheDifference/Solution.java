package FindTheDifference;

class Solution {
    public char findTheDifference(String s, String t) {
        int str1 = 0;
        int str2 = 0;
        for (char num : s.toCharArray()) {
            str1 += num;
        }
        for (char num : t.toCharArray()) {
            str2 += num;
        }
        return (char)(str2 - str1);
    }
}
