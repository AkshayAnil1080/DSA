//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


// N*(max_len_word)
//SC O(max_lenth_word) for trie or max width oflevel order tree(sworst all string end at same lelev)
// SC: O(max(max_lenth_word) , N)  - O(N)
class Solution{
	public static String longestString(int n, String[] arr) {
		String ans;
		// makre trie and insert it
        Trie trie = new Trie();
        for (String w : arr)
        {
            trie.insert(w);
        }
        //run bfs
        ans = trie.bfs();
        return ans;
    }
}
// s1
class Trie
{
    Node root;
    Trie(){
    	this.root = new Node();
    }
    void insert(String word)
    {
        Node node = root;
        for (int i = 0; i < word.length(); i++) //1 inderting the word in trie;
        { 
            if (!node.containsKey(word.charAt(i)))
            {
                node.set(word.charAt(i), new Node());
            }

            node = node.get(word.charAt(i)); 
        }
        node.setEnd(); //setting the word end as true- to indicate the word has ended.
    } 
//s2
    String bfs()   // simplealevel order traversal
    {
        Node node = root;
        Queue<Pair> q = new LinkedList<>();
        //queue<pair<Node *, string>> q;
        String ans = "";
//        char pre;
//        String temp = "";
        q.add(new Pair(node, ""));
        while (!q.isEmpty())
        {
            int sz = q.size();  // level size

            for (int i = 0; i < sz; i++) //itr in level
            {
                Node cur = q.peek().first;
                String s = q.peek().second;
                q.poll();

// do only when / if we find the sring(word end set true) in trie , push in q;
                if (cur != root && !cur.isEnd()) 
                    continue;
                    
                for (int j = 0; j < 26; j++)  //here each node will have 26 children
                {
                    char ch = (char)(j + 'a');  // store the character of children
                    if (cur.get(ch) != null)
                    {
                        q.add(new Pair(cur.get(ch), s + ch)); // and push the node and string in Q
                    }
                }
                if (ans.length() < s.length()) // keep track of max length.
                {
                    ans = s;
                }
            }
        }
        return ans;
    }
}


//
class Node
{
    Node links[] = new Node[26];  // each nde have 26 enries
    boolean flag = false;
    
    boolean containsKey(char ch) // check if node has the entr with part ch.
    {
        return (links[ch - 'a'] != null);
    }

    void set(char ch, Node node) // if not //make  a new on while insetting and set it
    {
        this.links[ch - 'a'] = node;
    }

    Node get(char ch) // get to the part entry if exist.
    {
        return links[ch - 'a'];
    }

    void setEnd() //if  words end here, mark it true;
    {
        flag = true;
    }

    boolean isEnd()  ///to check if word end here ?
    {
        return flag;
    }
}
class Pair{  // why - to send both data in Queue ( the node and string from root to word end)
	Node first;
	String second;
	Pair(Node first, String second){
		this.first = first;
		this.second = second;
	}
}

