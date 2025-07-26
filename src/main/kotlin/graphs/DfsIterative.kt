package graphs

import java.util.Stack

data class Node(val data: Int, val left: Node?, val right: Node?)

class Pair(val node: Node, val depth: Int)

class DfsIterative {
    fun maxDepth(root: Node?): Int {
        if (root == null) {
            return 0
        }

        val stack: Stack<Pair> = Stack()
        stack.push(Pair(root, 1))
        var ans = 0

        while (!stack.empty()) {
            val pair = stack.pop()
            val node = pair.node
            val depth = pair.depth

            ans = maxOf(ans, depth)
            if (node.left != null) {
                stack.push(Pair(node.left, depth + 1))
            }
            if (node.right != null) {
                stack.push(Pair(node.right, depth + 1))
            }
        }
        return ans
    }

}