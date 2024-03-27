package binarysearch;

public class GuessNumberHigherOrLower {
    public static int guess(int num) {
    	int pick=1702766719;
    	if(num>pick)
    		return -1;
    	else if(num<pick)
    		return 1;
    	else if(num==pick)
    		return 0;
    	return 1;
    }
    
    public static int solution(int n) {
    	int l=1,r=n,mid=0;
    	while(l<r) {
    		mid=(l+r)/2;
    		if(guess(mid)==0)
    			return mid;
    		else if(guess(mid)>0)
    		l=l+1;
    		else if(guess(mid)<0)
    			r=r-1;
    	}
    	return l;
    }
	public static void main(String[] args) {
		int n=2126753390;
		System.out.println(solution(n));  
	}

}
