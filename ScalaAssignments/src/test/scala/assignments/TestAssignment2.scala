package assignments

import org.junit.Assert._
import org.junit.Before
import org.junit.Test
import org.scalatest.junit.JUnitSuite

import assignments.assignment2.LinkedList

class TestAssignment2 extends JUnitSuite {
  
  var linkedList: LinkedList = _
  
  @Before def createList: Unit = {
    linkedList = new LinkedList()
  }
  
  @Test def emptyOnCreate: Unit = {
    assertTrue(linkedList.isEmpty)
  }
  
  @Test def nonEmptyAfterAdd: Unit = {
    linkedList.add(1)
    assertFalse(linkedList.isEmpty)
  } 
  
  @Test def add4Get5th: Unit = {
    linkedList.add(List(1, 2, 3, 4))
    linkedList.getNthNodeFromEnd(5)
    assertEquals(linkedList.target.nodeData, None) 
  }    
  
  @Test def add5Get5th: Unit = {
    linkedList.add(List(1, 2, 3, 4, 5))
    linkedList.getNthNodeFromEnd(5)
    assertEquals(linkedList.target.nodeData, 5) 
  }  
  
  @Test def add10Get5th: Unit = {
    linkedList.add(List(1,2,3,"abcef",4.5,"xyz",6,100,"DEF",3.2,9))
    linkedList.getNthNodeFromEnd(5)
    assertEquals(linkedList.target.nodeData, 4.5) 
  } 
  
  @Test def addNoneGet5th: Unit = {
    linkedList.getNthNodeFromEnd(5)    
  }  
}