public class Palindrome {
  /**
   * A recursive function to check if a string is a palindrome
   *
   * @param phrase This parameter is what will be tested
   * @return Whether or not the phrase is a palindrome
   */
  public static boolean isPalindrome(String phrase) {
    if (phrase.length() <= 1) return true;
    // Compare the first and last characters of the string
    // and recurseively check the subsequent characters.
    // If comparison returns false, it's not a palindrome
    return phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
      && isPalindrome(phrase.substring(1, phrase.length() - 1));
  }
}
