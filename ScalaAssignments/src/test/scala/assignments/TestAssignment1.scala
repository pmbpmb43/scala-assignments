package assignments

import org.junit.Test
import org.junit.Assert._
import assignments.assignment1.TriangleTester
import org.scalatest.junit.JUnitSuite

class TestAssignment1 extends JUnitSuite {
  @Test def testEquilateral: Unit = {
    val triangleTester = new TriangleTester(1, 1, 1)
    println(triangleTester)
    assertEquals(triangleTester.triangleType, "equilateral")
  }
  
  @Test def testIsosceles: Unit = {
    val triangleTester = new TriangleTester(2, 1, 1)
    println(triangleTester)
    assertEquals(triangleTester.triangleType, "isosceles")    
  }
  
  @Test def testScalene: Unit = {
    val triangleTester = new TriangleTester(2, 3, 1)
    println(triangleTester)
    assertEquals(triangleTester.triangleType, "scalene")    
  }  
  
  @Test def testIsosceles2: Unit = {
    val triangleTester = new TriangleTester(2, 1, 2)
    println(triangleTester)
    assertEquals(triangleTester.triangleType, "isosceles")    
  }  
}