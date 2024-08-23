
package arrays;
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] a, int n) {
    	for(int i=0;i<a.length;++i) {
    		if(a[i]==0 && ((i-1)<0 || a[i-1]==0) && (i+1>=a.length || a[i+1]==0)) {
    			a[i]=1;
    			n--;
    		}
    		else {
    			continue;
    		}
    	}
    	System.out.println(n);
    	if(n<=0)
        return true;
    	else
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []flowerbed= {1,0,0,0,0,1};
         int n=2;
         System.out.println(canPlaceFlowers(flowerbed, n));
	}

}
