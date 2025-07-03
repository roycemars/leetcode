package hashing

class FindAllNumsByCriteria {
    fun findAll(nums: IntArray): IntArray {
        val set = mutableSetOf<Int>()
        val res = mutableListOf<Int>()

        for(i in nums) {
            set.add(i)
        }

        for(i in nums) {
            if(set.contains(i + 1) || set.contains(i - 1)) {
                continue
            }

            res.add(i)
        }

        return res.toIntArray()
    }
}