boolean hasCycle(Node head) {
  if (head == null) return false;
  Node slow = head;
  Node fast = head.next;
  while (fast != null && fast.next != null && slow != null) {
    if (fast == slow) return true;
    fast = fast.next.next;
    slow = slow.next;
  }
  return false;
}
