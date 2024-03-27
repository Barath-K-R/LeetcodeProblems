package Tree;

import java.util.*;
import java.util.Map.Entry;

public class WordSearchUsingTrie {

	static TrieNode root;
	 static class TrieNode{
		 Character c;
		HashMap<Character,TrieNode>children;
		boolean end;
		
		public TrieNode(Character c) {
			this.c=c;;
			this.end=false;
			this.children=new HashMap<Character,TrieNode>();
		}
		
	}
	 
	 public static void initialize() {
		 root=new TrieNode(' ');
	 }
	 
	 public static void addword(String word) {
		 TrieNode curr=root;
		 
		 for(int i=0;i<word.length();++i)
		 {
			 if(!curr.children.containsKey(word.charAt(i))) {
				 curr.children.put(word.charAt(i),new TrieNode(word.charAt(i)));
			 }
			curr=curr.children.get(word.charAt(i));
		 }
		 curr.end=true;
	 }
	 
	 public static boolean search(String word,int i,TrieNode root) {
		 
		 System.out.println("character "+root.c);
		 TrieNode curr=root;
		 for(i=i;i<word.length();++i)
		 {
			 if(word.charAt(i)=='.') {
				 for(Character n:curr.children.keySet())
				 {
					 System.out.println("dfs "+word.charAt(i)+"="+n);
					 if(search(word,i+1,curr.children.get(n)))
						 return true;
					 else
					 {
						 System.out.println("continue");
						 continue;
					 }
				 }
			 }
			 else {
				 System.out.println("check "+word.charAt(i)+" in "+curr.c);
				 System.out.println(curr.children.containsKey(word.charAt(i)));
				 if(!curr.children.containsKey(word.charAt(i)))
				 {
					 System.out.println("returning false");
					 System.out.println();
					 return false;
				 }
				 curr=curr.children.get(word.charAt(i));
			 }
		 }
		 return true;
		
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initialize();
		addword("a");
		addword("abc");
		addword("bd");
		addword("barath");
		System.out.println(search("bat",0,root));

	}

}
