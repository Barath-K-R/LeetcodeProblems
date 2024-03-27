package backtracking;

import java.util.HashSet;
import java.util.Set;

public class WordSearch {
    public static Set<String>set=new HashSet<String>();
	public static boolean search(String[][]board,int index,int r,int c,String word) {
		if(index>=word.length())
			return true;
		
		System.out.println(set+" "+board[r][c]+" have to match "+word.substring(index,index+1));
		
		String indexString=Integer.toString(r)+Integer.toString(c);
		int br=board.length,bc=board[0].length;
		System.out.println("br="+br+" bc="+bc+" "+r+" "+c);
		if((r-1>=0 && r-1<br) && !set.contains(Integer.toString(r-1)+Integer.toString(c)))
		{
			System.out.println("up matches");
			if(board[r-1][c].contains(word.substring(index,index+1))) 
			{
				System.out.println("up");
				set.add(Integer.toString(r-1)+Integer.toString(c));
				if(search(board, index+1, r-1, c, word))
					return true;
				else {
					return false;
				}
			}
		}
		if((r+1>=0 && r+1<br) && !set.contains(Integer.toString(r+1)+Integer.toString(c)))
		{
			System.out.println("down matches");
			if(board[r+1][c].contains(word.substring(index,index+1)))
			{
				System.out.println("down");
				set.add(Integer.toString(r+1)+Integer.toString(c));
				if(search(board, index+1,r+1,c, word))
					return true;
				else
					return false;
			}
		}
		if((c-1>=0 && c-1<bc) && !set.contains(Integer.toString(r)+Integer.toString(c-1))) {
			System.out.println("left matches");
			if(board[r][c-1].contains(word.substring(index,index+1)))
			{
				System.out.println("left");
				set.add(Integer.toString(r)+Integer.toString(c-1));
				if(search(board, index+1,r,c-1, word))
					return true;
				else
					return false;
			}
		}
		 if((c+1>=0 && c+1<bc) && !set.contains(Integer.toString(r)+Integer.toString(c+1))) {
			System.out.println("right matches");
			if(board[r][c+1].contains(word.substring(index,index+1))) {
				System.out.println("right");
				set.add(Integer.toString(r)+Integer.toString(c+1));
				if(search(board, index+1,r,c+1, word))
					return true;
				else 
					return false;
			}
		}
		set.remove(Integer.toString(r)+Integer.toString(c));
		return false;
	}
	public static boolean solution(String[][]board,String word) {
		int index=0;
		for(int i=0;i<board.length;++i)
		{
			for(int j=0;j<board[0].length;++j)
			{
				if(board[i][j].contains(word.substring(index,index+1)))
				{
					set.add(Integer.toString(i)+Integer.toString(j));
					if(search(board,index+1,i,j,word))
						return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[][]board= {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String wordString="FCEF";
        System.out.println(solution(board, wordString));
	}

}
