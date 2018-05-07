if(head == null){
	return null
}

ListNode f = head;
ListNode S = head;

for(int i = 0 ; i < n ; i++){
	f = f.next;
}

if(f==null){
	head= head.next;
	return head;
}

while(fast.next != null){
	fast = fast.next;
	s = s.next;
}

s.next = s.next.next;

return head



ListNode head = ListNode(0);
ListNode p= head;

while(l1 != null || l2 != null){
	if(&&){
		if(1<2){
		 .....
		}else{
			p.next = l2
			l2 = l2.next;
			p= p.next;
		}
	}else if(l1==null){
		p.next =l1
	}
}

return head.next





/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // // write your code here
        // if(head==null || head.next == null)
        //     return head;
        
        // ListNode p1=head;
        // ListNode p2=head.next;
        
        // //set tail
        
        
        // while(p1!=null && p2!=null){
            
        //     ListNode tmp=p2.next;
        //     p2.next=p1;
            
        //     p1=p2;
        //     p2=tmp;
        // }
        // head.next =null;
        // return p1;
    if(head==null || head.next == null)
        return head;
 
    //get second node    
    ListNode second = head.next;
    //set first's next to be null
    // head.next = null;
 
    ListNode rest = reverse(second);
    
    second.next = head;
    head.next = null;
 
    return rest;
    }
}