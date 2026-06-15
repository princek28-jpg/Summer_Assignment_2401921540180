package Week_3.Day_1;
import java.util.HashSet;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}
public class Linked_List_cylce {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited=new HashSet<>();
        while(head!=null){
            if(visited.contains(head)){
                return true;
            }
            visited.add(head);
            head=head.next;
        }
        return false;
    }
}