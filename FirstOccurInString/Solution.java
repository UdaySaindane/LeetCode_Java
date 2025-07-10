class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) return 0; // Empty needle case

        // Slide through haystack to match needle
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;

            // Check character by character
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched
            if (j == nLen) return i;
        }

        return -1; // Needle not found
    }
}
