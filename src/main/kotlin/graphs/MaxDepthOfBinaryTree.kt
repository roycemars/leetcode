package graphs

import kotlin.math.max

class MaxDepthOfBinaryTree {
    class Node(var value: Int, var left:Node?, var right: Node?)

    fun maxDepth(root: Node?): Int {
        if (root == null) {
            return 0
        }

        val left = maxDepth(root.left)
        val right = maxDepth(root.right)

        return max(left, right)
    }
}