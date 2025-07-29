package graphs

import java.util.*


class RightSideView {
    fun rightSideView(root: Node?): List<Int> {
        if (root == null) {
            return listOf()
        }

        val ans = mutableListOf<Int>()
        val queue: Queue<Node> = ArrayDeque<Node>()
        queue.add(root)

        while (!queue.isEmpty()) {
            val currentLength = queue.size
            var prev = 0

            for (i in 0..< currentLength) {
                val node = queue.remove()
                prev = node.data

                if (node.left != null) {
                    queue.add(node.left)
                }

                if (node.right != null) {
                    queue.add(node.right)
                }
            }

            ans.add(prev)
        }

        return ans
    }
}