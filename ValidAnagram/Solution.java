package ValidAnagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = new char[s.length()];
        char[] str2 = new char[t.length()];

        for(int i = 0; i< s.length(); i++){
            str1[i] = s.charAt(i);
        }
        for(int i = 0; i< t.length(); i++){
            str2[i] = t.charAt(i);
        }
        
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}