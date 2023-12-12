public class Trie {

    class Node {
        Node[] children = new Node[26];
        char val;
        boolean endOfWord = false;
    }

    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node currentNode = root;
        for (char c : word.toCharArray()) {
            if (currentNode.children[c - 'a'] == null) {
                Node child = new Node();
                child.val = c;
                currentNode.children[c - 'a'] = child;
            }
            currentNode = currentNode.children[c - 'a'];
        }
        currentNode.endOfWord = true;
    }

    public boolean search(String word) {
        Node currentNode = root;
        for (char c : word.toCharArray()) {
            if (currentNode.children[c - 'a'] == null) {
                return false;
            }
            currentNode = currentNode.children[c - 'a'];
        }
        return currentNode.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Node currentNode = root;
        for (char c : prefix.toCharArray()) {
            if (currentNode.children[c - 'a'] == null) {
                return false;
            }
            currentNode = currentNode.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */