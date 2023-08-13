package practice;

class practice {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        String input = "racecar"; // Change this to test different strings
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
