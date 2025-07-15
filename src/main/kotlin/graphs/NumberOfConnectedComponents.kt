package graphs

class NumberOfConnectedComponents {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        var components = 0
        var visited = IntArray(n)

        val adjList : Array<MutableList<Int>> = Array(n) { mutableListOf() }
        for (i in 0..n - 1) {
            adjList[i] = mutableListOf()
        }

        for (i in 0..edges.size - 1) {
            adjList[edges[i][0]].add(edges[i][1])
            adjList[edges[i][1]].add(edges[i][0])
        }

        for (i in 0..n - 1){
            if (visited[i] == 0) {
                components++
                dfs(adjList, visited, i)
            }
        }

        return components
    }

    fun dfs(adjList: Array<MutableList<Int>>, visited: IntArray, startNode: Int) {
        visited[startNode] = 1

        for (i in 0..adjList[startNode].size - 1) {
            if (visited[adjList[startNode].get(i)] == 0) {
                dfs(adjList, visited, adjList[startNode].get(i))
            }
        }
    }
}