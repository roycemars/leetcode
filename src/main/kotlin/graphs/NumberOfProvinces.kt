package graphs

class NumberOfProvinces {
    val graph = mutableMapOf<Int, MutableList<Int>>()
    var seen: BooleanArray? = null

    fun findCircleNum(isConnected: Array<Array<Int>>): Int {
        val n = isConnected.size

        for (i in 0 .. n - 1) {
            if(!graph.containsKey(i)) {
                graph.put(i, mutableListOf())
            }
            for (j in i + 1 .. n - 1) {
                if (!graph.containsKey(j)) {
                    graph.put(j, mutableListOf())
                }

                if (isConnected[i][j] == 1) {
                    graph[i]?.add(j)
                    graph[j]?.add(i)
                }
            }
        }

        seen = BooleanArray(n)
        var ans = 0
        for (i in 0 .. n - 1) {
            if (!(seen?.get(i) ?: false))  {
                ans++
                seen?.set(i, true)
                dfs(i)
            }
        }
        return ans
    }

    fun dfs(node: Int) {
        val list = graph.get(node) ?: listOf()
        for (neighbor in list) {
            if (!(seen?.get(neighbor) ?: false)) {
                seen?.set(neighbor, true)
                dfs(neighbor)
            }
        }
    }
}