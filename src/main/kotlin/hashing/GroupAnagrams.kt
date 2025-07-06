package hashing

class GroupAnagrams {
    fun solve(strs: Array<String>): Array<Array<String>> {
        val groups = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            val charArray = s.toCharArray()
            charArray.sort()
            val key = String(charArray)

            if (!groups.containsKey(key)) {
                groups.put(key, mutableListOf())
            }

            groups[key]?.add(s)
        }

        return groups.values.map { it.toTypedArray() }.toTypedArray()
    }
}