/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbersSolution {
    public ListNode addNewNode(int x, ListNode l3){
        ListNode node = l3;
         if(l3==null){
            node= new ListNode(x, null);
               return node;
            }
        while(l3.next!=null)
            l3=l3.next;
        
        l3.next= new ListNode(x, null);
        
        return node;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n3 = 0, carry=0;
        ListNode head1=l1, head2=l2;
        ListNode l3 = null;

        while(head1!=null || head2!=null){
            if(head1!=null && head2!=null){
                n3= head1.val + head2.val + carry;
                int a= n3 % 10;
                carry = n3/10;
                if(head1.next==null && head2.next==null){
                    if(carry==0){
                        l3 = addNewNode(n3,l3);
                        return l3;
                    }
                    else{
                        l3 = addNewNode(a,l3);
                        l3 = addNewNode(carry,l3);
                        return l3;
                    }
                }
                l3= addNewNode(a,l3);
                head1= head1.next;  
                head2=head2.next;
                
            }
            else if(head1!=null && head2==null){
                n3= head1.val+carry;
                int a= n3 % 10;
                carry = n3/10;
                if(head1.next==null){
                        if(carry!=0){
                    l3= addNewNode(a,l3);
                    l3= addNewNode(carry,l3);
                    return l3;
                        }
                    else{
                        l3=addNewNode(n3,l3);
                        return l3;
                    }
                    
                }
                head1=head1.next;
                l3= addNewNode(a,l3);

            }
        
            else if(head2!=null && head1==null){
                n3= head2.val+carry;
                int a= n3 % 10;
                carry = n3/10;
                if(head2.next==null){
                    if(carry!=0){
                        l3= addNewNode(a,l3);
                        l3= addNewNode(carry,l3);
                        return l3;
                    }
                    else{
                        l3=addNewNode(n3,l3);
                        return l3;
                    }
                }
                head2= head2.next;
                l3= addNewNode(a,l3);

            }
        
        }
        return l3;
    }
}
