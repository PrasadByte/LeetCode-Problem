package linkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int new_data) {
        data = new_data;
        next = null;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
     // Create a hard-coded linked list: 1 -> 2 -> 3 -> 4 -> 5

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Given Linked list:");
        printList(head);

        head = new ListNode(0).reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}
