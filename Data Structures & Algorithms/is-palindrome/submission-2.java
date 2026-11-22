class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int leftptr = 0;
        int rightptr = s.length() - 1;

        while (leftptr < rightptr) {
            if (s.charAt(leftptr) != s.charAt(rightptr)) {
                return false;
            }

            leftptr++;
            rightptr--;
        }

        return true;
    }
}
