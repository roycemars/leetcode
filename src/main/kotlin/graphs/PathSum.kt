package graphs

class PathSum {
    class Node(val value: Int, var left: Node?, var right: Node?)

    var target = 0

    fun hasPathSum(root: Node, targetSum: Int): Boolean {
        target = targetSum
        return dfs(root, 0)
    }

    fun dfs(node: Node?, curr: Int): Boolean {
        if (node == null) {
            return false
        }

        if (node.left == null && node.right == null) {
            return (curr + node.value) == target
        }

        val newCurr = curr + node.value
        val left = dfs(node.left, newCurr)
        val right = dfs(node.right, newCurr)
        return left || right
    }
}