package arrays;
<<<<<<< HEAD
public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int target=tickets[k],seconds=0;;
        for(int i=0;i<tickets.length;++i){
            if(tickets[i]>=target && i<k)
            seconds+=target;
            else if(tickets[i]>=target && i>k)
            seconds+=target-1;
            else
            seconds+=tickets[i];
        }
        
        return seconds;
    }
    public static void main(String[] args) {
        int[]tickets={84,49,5,24,70,77,87,8};
        int k=3;
=======

public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int seconds=0;
        for(int i=0;i<tickets.length;++i){
            if(tickets[i]>=tickets[k])
            seconds+=tickets[k];
            else 
            seconds+=tickets[i];
        }
        return seconds;
    }
    public static void main(String[] args) {
        int[]tickets={5,1,1,1};
        int k=0;
>>>>>>> 892a99a5c78e932812ca6abd771f1b7c51f04592
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
