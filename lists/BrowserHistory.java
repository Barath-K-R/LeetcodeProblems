package lists;
class ListNode{
    ListNode back;
    ListNode forward;
    String url;
    public ListNode(String url){
        this.url=url;
        back=forward=null;
    }
}
public class BrowserHistory {
    ListNode head,current;
    public BrowserHistory(String homepage) {
        head=new ListNode(homepage);
        current=head;
    }

    public void visit(String url) {
        current.forward = new ListNode(url);
        current.forward.back = current;
        current = current.forward;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;++i){
            if(current.back==null)
            break;
            current=current.back;
        }
        return current.url;
    }
    
    public String forward(int steps) {
        for(int j=0;j<steps;++j){
            if(current.forward==null)
            break;
            current=current.forward;
        }
        return current.url;
    }
    public static void main(String[] args) {
        
    }
}
