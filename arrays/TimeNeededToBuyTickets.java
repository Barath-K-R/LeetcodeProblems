package arrays;

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
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
