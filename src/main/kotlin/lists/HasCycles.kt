package lists

class HasCycles {
    class Node(val value: Int, var next: Node? = null)

    fun hasCycles(head: Node?): Boolean {
        var fast = head
        var slow = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                return true
            }
        }

        return false
    }
}