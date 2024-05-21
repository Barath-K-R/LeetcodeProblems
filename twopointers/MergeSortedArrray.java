public class MergeSortedArrray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = n - 1, p2 = m - 1;
        
        for(int pointer=n+m-1;pointer>=0;pointer--) {
            if(p1>=0 && p2>=0){
                nums1[pointer]=nums1[p1]>nums2[p2]?nums1[p1--]:nums2[p2--];
            }
            else if(p1>=0){
                nums1[pointer]=nums1[p1--];
            }
            else{
                nums1[pointer]=nums2[p2--];
            }
        }
        for (int num : nums1)
            System.out.println(num);
    }

    public static void main(String[] args) {
        int[] nums1 = {0}, nums2 = {1};
        int n = 0, m = 1;
        merge(nums1, m, nums2, n);
    }
}
