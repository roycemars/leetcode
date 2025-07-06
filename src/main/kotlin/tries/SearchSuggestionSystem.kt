package tries

class SearchSuggestionSystem {
    class TrieNode(var children: MutableMap<Char, TrieNode> = mutableMapOf(),
                   val suggestions: MutableList<String> = mutableListOf())

    fun suggestedProducts(products: Array<String>, searchWord: String) {
        val root = TrieNode()
        for (product in products) {
            var node = root
            for (c in product.toCharArray()) {
                if (!node.children.containsKey(c)) {
                    node.children.put(c, TrieNode())
                }
                node = node.children.getOrDefault(c, TrieNode())
                node.suggestions.add(product)
                node.suggestions.sort()

                if (node.suggestions.size > 3 ) {
                    node.suggestions.removeAt(node.suggestions.size - 1)
                }
            }
        }

        val ans: MutableList<List<String>> = mutableListOf()
        var node = root

        for (c in searchWord.toCharArray()) {
            if (node.children.containsKey(c)) {
                node = node.children.getOrDefault(c, TrieNode())
                ans.add(node.suggestions)
            } else {
                node.children = mutableMapOf()
                ans.add(mutableListOf())
            }
        }

        return ans
    }
}