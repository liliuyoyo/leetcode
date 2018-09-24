public class middle_of_linked_list {

      public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode ptr1=head;
            ListNode ptr2=head;
            while(ptr2.next != null){
                ptr1 = ptr1.next;
                if(ptr2.next != null && ptr2.next.next !=null){
                    ptr2 = ptr2.next.next;
                }else{
                    ptr2 = ptr2.next;
                }
            }
            return ptr1;
        }
    }
}
