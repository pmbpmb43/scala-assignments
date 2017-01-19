package assignments

import assignments.assignment3.ListPairChecker
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert._

class TestAssignment3 extends JUnitSuite {
  
  @Test def testNullList {
    val listPairChecker = new ListPairChecker(List(), null)
    assertFalse(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }
    
  @Test def testAllOfFirstInSecond {
    val listPairChecker = new ListPairChecker(List("abc", 4.2, "DEF", 3), List("3", 3, "DEF", 5, 4.2, "abc", 7))
    assertTrue(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }
  
  @Test def testAllOfSecondInFirst {
    val listPairChecker = new ListPairChecker(List("ghi", 3, "DEF", 5, 4.2, "abc", 7), List("abc", 4.2, "DEF", 3))
    assertTrue(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }  
  
  @Test def testFirstEmpty {
    val listPairChecker = new ListPairChecker(List(), List("ghi", 3, "DEF", 5, 4.2, "abc", 7))
    assertTrue(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }  
  
  @Test def testSecondEmpty {
    val listPairChecker = new ListPairChecker(List("ghi", 3, "DEF", 5, 4.2, "abc", 7), List())
    assertTrue(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }    
  
  @Test def testBothEmpty {
    val listPairChecker = new ListPairChecker(List(), List())
    assertTrue(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  }  
  
  @Test def testAllOfOneNotInOther {
    val listPairChecker = new ListPairChecker(List("ghi", "DEF", 5, 4.2, "abc", 7), List("abc", 4.2, "DEF", 3))
    assertFalse(listPairChecker.allOfOneInOther)
    println(listPairChecker)
  } 
  
}