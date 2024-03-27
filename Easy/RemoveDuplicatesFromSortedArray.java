package Easy;

public class RemoveDuplicatesFromSortedArray {

	public void removeduplicate() {
		
	}
	public static void main(String[] args) {
	     int []a= {0,0,1,1,1,2,2,3,3,4};
	     
	     int temp=a[0],index=0,count=1;
	     
	     for(int i=0;i<a.length;++i) {
	    	 if(temp!=a[i])
	    	 {
	    		 a[++index]=a[i];
	    		 temp=a[i];
	    		 count++;
	    	 }
	     }
	     
	     for(int res:a)
	    	 System.out.print(res+" ");
	     System.out.println("count="+count);
	    
	     
	}
}
