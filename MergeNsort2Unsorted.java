static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        SinglyLinkedListNode result = head1;
        SinglyLinkedListNode temp = result;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head2;
        return sortlist(result);
    }
    static SinglyLinkedListNode sortlist(SinglyLinkedListNode result){
        SinglyLinkedListNode current = result;
        SinglyLinkedListNode traverse = null;
        while(current!=null){
            traverse = current.next;
            while(traverse!=null){
                if(current.data>traverse.data){
                     int temp = current.data;
                     current.data = traverse.data;
                     traverse.data = temp; 
                }
                traverse = traverse.next;
            }
            current = current.next;
        }
        return result;
    }
