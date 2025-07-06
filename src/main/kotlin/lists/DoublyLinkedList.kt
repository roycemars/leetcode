package lists

class DoublyLinkedList {
    class Node(val value: Int, var next: Node? = null, var prev: Node? = null)

    var head: Node? = null
    var tail: Node? = null

    fun add(v: Int) {
        val node = Node(v)
        if (head == null) {
            head = node
            tail = node
        } else {
            tail?.next = node
            node.prev = tail
            tail = node
        }
    }
}