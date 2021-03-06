public class MyQueue<T> {
  private Stack<T> stackNewestOnTop = new Stack<T>();
  private Stack<T> stackOldestOnTop = new Stack<T>();
  
  public void enqueue(T value) {
    stackNewestOnTop.push(value);
  }
  
  public T peek() { // get oldest item
    // move elements from stackNewest to stackOldest
    shiftStacks();
    return stackOldestOnTop.peek();
  }
  
  private void shiftStacks() {
    if (stackOldestOnTop.isEmpty()) 
      while (!stackNewestOnTop.isEmpty()) 
        stackOldestOnTop.push(stackNewestOnTop.pop());
  }
  
  public T dequeue() { // get oldest item and remove it
    // move elements from stackNewest to stackOldest
    shiftStacks();
    return stackOldestOnTop.pop(); 
  }
}
      


