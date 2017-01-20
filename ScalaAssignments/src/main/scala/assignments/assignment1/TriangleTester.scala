package assignments.assignment1

import java.util.Scanner
import scala.util.Try

class TriangleTester(val side0: Int, val side1: Int, val side2: Int) { 
  
    var triangleType = "invalid"
    
    private def getType(): Unit = {
      if (side0 > 0 && side1 > 0 && side2 > 0)
      {
        if (side0 == side1) {
          if (side0 == side2) {
            triangleType = "equilateral"
          } else {
            triangleType = "isosceles"
          }
        } else if (side0 == side2) {
          triangleType = "isosceles"
        } else if (side1 == side2) {
          triangleType = "isosceles"
        } else {
          triangleType = "scalene"
        }
      }
    }
  
    getType()
    
    override def toString = {
      "A triangle with side lengths of %s, %s, and %s is %s.".format(side0, side1, side2, triangleType)
    }
}

class TriangleTest {
    
  println("This is a test that takes 3 lengths of a triangle and determines if it's equilateral, isosceles, or scalene.")
  print("Input 3 integers in a row (separated by spaces) and press enter: ")
  val scanner = new Scanner(System.in)
  val input = scanner.nextLine()
  val sides = input.split(" ")
  if (sides.length >= 3)
  {
    var s0 = 0
    var s1 = 0
    var s2 = 0
    try {
       s0 = sides(0).toInt
       s1 = sides(1).toInt
       s2 = sides(2).toInt
    } catch {
      case t: Throwable => //ignore  
    }   
    println(new TriangleTester(s0, s1, s2)) 
  }
}