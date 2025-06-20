package hashing;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterSeen {

    /**
     * Given a string s, return the first character to appear twice. It is guaranteed that the input will have a duplicate character.
     * @param s input string, example: "abcdecf"
     * @return the first character to appear twice, example: 'c'
     */
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
