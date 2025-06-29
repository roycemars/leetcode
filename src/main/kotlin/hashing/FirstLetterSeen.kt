package hashing

class FirstLetterSeen {
    /**
     * Given a string s, return the first character to appear twice. It is guaranteed that the input will have a duplicate character.
     * @param s input string, example: "abcdecf"
     * @return the first character to appear twice, example: 'c'
     */
    fun findFirstLetterSeen(s: String): Char? {
        val seenSet = HashSet<Char>()
        for (c in s.toCharArray()) {
            if(c in seenSet) {
                return c
            }

            seenSet.add(c)
        }
        return null
    }
}