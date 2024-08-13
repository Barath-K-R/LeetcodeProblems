package arrays;
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
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
