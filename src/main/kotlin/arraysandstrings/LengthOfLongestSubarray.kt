package arraysandstrings

import kotlin.math.max

fun findLength(a: Array<Int>, k: Int): Int {
    var left = 0
    var c = 0
    var r = 0

    for (right in 0 .. a.size - 1) {
        c += a[right]

        while (c > k) {
            c -= a[left]
            left++
        }

        r = max(r, right - left - 1)
    }

    return r
}