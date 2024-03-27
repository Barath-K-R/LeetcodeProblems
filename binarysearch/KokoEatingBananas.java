package binarysearch;

public class KokoEatingBananas {

    public static int solution(int[]piles,int h) {
    	if(h<piles.length)
    		return 0;
    	int max=0,minhours=Integer.MAX_VALUE,minbananas=Integer.MAX_VALUE;
    	for(int i=0;i<piles.length;++i)
    		max=Math.max(max, piles[i]);
    	
    	int l=1,r=max,currminbananas=Integer.MAX_VALUE;
    	while(l<r)
    	{
    		currminbananas=(l+r)/2;
    		System.out.println("currminbabans="+currminbananas);
    		int currhours=0;
    		for(int j=0;j<piles.length;++j)
    		{
    			currhours=(int) (currhours+Math.ceil((double)piles[j]/currminbananas));
    		}
    		System.out.println("currhours="+currhours);
    		System.out.println("oldmin="+minbananas);
    		if(currhours<=h && currminbananas<minbananas)
    		{
    			minhours=(int) currhours;
    			minbananas=currminbananas;
    			System.out.println("neww min="+minbananas);
    		}
    		if(currhours>h)
    			l=currminbananas+1;
    		else 
    			r=currminbananas-1;
    		System.out.println();
		}
    	return minbananas;
    		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]piles= {805306368,805306368,805306368};
		int h=1000000000;
		System.out.println(solution(piles,h));

	}

}
