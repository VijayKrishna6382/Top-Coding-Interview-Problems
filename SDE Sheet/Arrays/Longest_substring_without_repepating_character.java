package sdesheet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            boolean[] visited = new boolean[128];  // Track visited chars in current substring
            int currentLength = 0;

            for (int j = i; j < str.length; j++) {
                if (visited[str[j]]) {   // If char already visited, stop this substring
                    break;
                }
                visited[str[j]] = true;  // Mark char as visited
                currentLength++;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;  // Update max length found
            }
        }

        return maxLength;
    }
}
