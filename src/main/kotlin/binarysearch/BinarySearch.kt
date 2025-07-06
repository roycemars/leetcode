package binarysearch

class BinarySearch {
    fun binarySearch(arr: IntArray, target: Int): Int {
        var left = 0
        var right = arr.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (arr[mid] == target) {
                return mid
            }

            if (arr[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return left
    }
}