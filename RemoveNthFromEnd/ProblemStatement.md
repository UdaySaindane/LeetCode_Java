
---

## 💡 Approach (Two Pointer Technique)

1. Use two pointers: `first` and `second`.
2. Move `first` pointer `n` steps ahead.
3. Then move both `first` and `second` together until `first` reaches the end.
4. Now `second` is just before the node to remove.
5. Change the `next` pointer of `second` to skip the target node.

---

## ✅ Java Code (Two Pointer)

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases smoothly
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from end
        second.next = second.next.next;

        return dummy.next;
    }
}
