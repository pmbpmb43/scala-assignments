package assignments.assignment2

class LinkedListNode(val nodeData: Any, val nextNode: LinkedListNode) {
  
  def this() {
    this(None, null)
  }
  
  def isEmpty: Boolean = {
     return nodeData == None
  }
  
}