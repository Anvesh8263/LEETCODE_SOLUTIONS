class Solution {
    public ListNode reverseList(ListNode head) {
//         ListNode current = head;
//         ListNode previous = null;
//         ListNode next = null;
//         while(current!=null){
//             next=current.next;
//             current.next=previous;
//                 previous=current;
//             current=next;
            
//         }
//         return previous;
//     }
// }
        if(head==null){
           return null;
            
            }else if(head.next==null){
            return head;
            
        }else{
            ListNode nextNode=head.next;
            head.next=null;
            ListNode rest=reverseList(nextNode);
            nextNode.next=head;
            return rest;
        }
        
        }
}