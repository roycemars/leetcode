package main.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, return the first character to appear twice. It is guaranteed that the input will have a duplicate character.
 * Example:
 * Input: s = "abcdecf"
 * Output: "c"
 */

public class FirstLetterSeen {
    public static void main(String[] args) {

    }

    public static Character findFirstLetterSeen(String s) {
        Set<Character> seenSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if(seenSet.contains(c)) {
                return c;
            }

            seenSet.add(c);
        }
        return null;
    }
}
