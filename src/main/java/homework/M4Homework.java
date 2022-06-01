package homework;

import org.w3c.dom.ls.LSOutput;

public class M4Homework {
    public static void main(String[] args) {
        M4Homework m4Homework = new M4Homework();
//        m4Homework.compareString("Cat", "Category");
        System.out.println(m4Homework.isPalindrome("abcba"));

    }

    public void compareString(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null) {
            System.out.println("Cannot compare Strings");
        } else if (firstWord.equals(secondWord)) {
            System.out.println("The Strings are the same");
        } else if (secondWord.contains(firstWord)) {
            System.out.println(firstWord + " is a part of " + secondWord);
        } else if (firstWord.contains(secondWord)) {
            System.out.println(secondWord + " is a part of " + firstWord);
        } else {
            System.out.println(firstWord + " is not a part of " + secondWord);
        }
    }

    public boolean isPalindrome(String text) {
        boolean palindrome = false;
        if (text == null || text.isEmpty() || text.isBlank()) {
            System.out.println("Error. The string is null or empty");
        } else {
            String textReverse = "";
            int lastLetter = text.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                textReverse = textReverse + text.charAt(i);
            }
            if (text.equals(textReverse)) {
                palindrome = true;
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
