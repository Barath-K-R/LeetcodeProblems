package tries;

import java.util.HashMap;
import java.util.List;


public class Trie {
    private TrieNode root;
    class TrieNode{
        boolean isEnd;
        HashMap<Character,TrieNode>childern;

        public TrieNode(){
            this.isEnd=false;
            this.childern=new HashMap<>();
        }
    }
    public Trie(){
        this.root=new TrieNode();
    }

    public void insert(String s){
        TrieNode curr=root;
        for(char c:s.toCharArray()){

            curr.childern.putIfAbsent(c,new TrieNode());
            curr=curr.childern.get(c);
        }
        curr.isEnd=true;
    }

    public boolean search(String s){
        TrieNode curr=root;
        for(char c:s.toCharArray()){
     
            if(curr.childern.containsKey(c))
            curr=curr.childern.get(c);
        }
        return curr.isEnd;
    }

    public boolean startsWith(String s){
        TrieNode curr=root;
        for(char c:s.toCharArray()){
            if(!curr.childern.containsKey(c))
            return false;
            curr=curr.childern.get(c);
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple");
        trie.insert("amazon");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("amazon"));
        System.out.println(trie.startsWith("ams"));
        System.out.println(trie.startsWith("app"));
    }
      
}
