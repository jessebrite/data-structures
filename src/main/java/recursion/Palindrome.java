public class Palindrome {
  /**
   * A recursive function to check if a string is a palindrome
   *
   * @param phrase
   * @return boolean
   */
  public static boolean isPalindrome(String phrase) {
    if (phrase.length() <= 1) return true;
    // Sheck the first and last characters of the string if they are the same
    // and recurseively check the subsequent characters.
    // If comparison returns false, it's not a palindrome
    return phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
      && isPalindrome(phrase.substring(1, phrase.length() - 1));
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("a"));
    System.out.println(isPalindrome("ama"));
    System.out.println(isPalindrome("ama an na ama"));
  }
}
