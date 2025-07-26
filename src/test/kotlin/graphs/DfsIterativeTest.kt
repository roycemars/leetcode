package graphs

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DfsIterativeTest {
    @Test
    fun maxDepth() {
        val level4Right6 = Node(6, null, null)
        val level3Right5 = Node(5, null, level4Right6)
        val level3Left3 = Node(3, null, null)
        val level3Left4 = Node(4, null, null)
        val level2Left = Node(1, level3Left3, level3Left4)
        val level2Right = Node(2, null, level3Right5)
        val root = Node(0, level2Left, level2Right)
        assertEquals(4, DfsIterative().maxDepth(root))
    }

}