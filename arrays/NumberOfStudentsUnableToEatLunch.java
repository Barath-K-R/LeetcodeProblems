package arrays;

/**
 * NumberOfStudentsUnableToEatLunch
 */
public class NumberOfStudentsUnableToEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        int onecount=0,zerocount=0;
        for(int i=0;i<students.length;++i){
            if(students[i]==1)
            onecount++;
            else
            zerocount++;
        }
        for(int j=0;j<sandwiches.length;++j){
            if((sandwiches[j]==0 && zerocount==0) || (sandwiches[j]==1 && onecount==0))
            return sandwiches.length-j;
            
            if(sandwiches[j]==0)
            zerocount--;
            else
            onecount--;
            
        }
        return 0;
    }
public static void main(String[] args) {
    int []students={1,1,1,0,0,1},sandwiches={1,0,0,0,1,1};
    System.out.println(countStudents(students, sandwiches));
}
    
}