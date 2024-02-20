// https://www.geeksforgeeks.org/problems/word-break1352/1


class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

class Solution {
    static TrieNode root;

    public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
        // Initialize the root of the trie
        root = new TrieNode();
        // Build the trie 
        for (String word : dictionary) {
            insert(word);
        }
        // Check if the string can be segmented using the trie
        return canSegmentString(s, root) ? 1 : 0;
           
    }

    static boolean canSegmentString(String s, TrieNode root) {
        int n = s.length();
        if (n == 0)
            return true;
        TrieNode current = root;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (current.children[ch - 'a'] == null)
                return false;
            current = current.children[ch - 'a'];
            if (current.isEndOfWord && canSegmentString(s.substring(i + 1), root))
                return true;
        }
        return false;
    }

    static void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
}
