package assignments.assignment2

class LinkedList {
  
  var head:LinkedListNode = new LinkedListNode()
  var target:LinkedListNode = _
  
  def add(someData: Any): Unit = {
    val old = head
    this.head = new LinkedListNode(someData, old)    
  }
  
  def isEmpty: Boolean = {
     return head.nodeData == None
  }
  
  def add(someData: List[Any]): Unit = {
    someData.foreach(f => this.add(f))
  }  
  
  def getNthNodeFromEnd(n: Int): Unit = {    
    target = head
    var node = head
    var counter = n
    val output: StringBuilder = new StringBuilder()
    while (!node.isEmpty) {
      if (counter > 0)
        counter -= 1
      else
        target = target.nextNode
      output.append(node.nodeData)
      output.append(", ")
      node = node.nextNode
    }
    if (output.isEmpty)
      output.append("<empty list>")
    else
      // trim off last comma and space
      output.delete(output.length-2, output.length)
    output.insert(0, "Linked list element values: ")      
    println(output)
    
    if (target.isEmpty || counter > 0)
    {
      // set to empty in case fewer nodes than n (counter > 0)
      target = new LinkedListNode()
      println("List does not contain sufficient elements for one to be %s spots from end".format(n))
    }
    else
      println("Value of element at position %s spots from end is %s".format(n, target.nodeData));
  }  

}