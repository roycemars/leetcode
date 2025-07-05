package hashing

class CheckEqualFrequency {
    fun checkEqualFequency(s: String): Boolean {
        val counts: MutableMap<Char, Int> = mutableMapOf()
        for (c in s) {
            counts.put(c, counts.getOrDefault(c, 0) + 1)
        }

        val frequencies = counts.values.toSet()
        return frequencies.size == 1
    }
}