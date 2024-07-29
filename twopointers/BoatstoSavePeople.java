package twopointers;

import java.util.Arrays;

public class BoatstoSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCount=0,l=0,r=people.length-1;
        while(l<=r){
            int rem=limit-people[r];
            r--;
            boatCount++;
            if(rem>=people[l]){
                l++;
            }
        }
        return boatCount;
    }

    

    public static void main(String[] args) {
        int[] people = { 5,1,4,2};
        System.out.println(numRescueBoats(people, 6));
    }
}
