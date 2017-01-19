package assignments.assignment1

class TriangleTester(val side0: Int, val side1: Int, val side2: Int) { 
  
    var triangleType = "scalene"
    
    private def getType() {
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
  
    getType()
    
    override def toString = {
      "A triangle with side lengths of %s, %s, and %s is %s.".format(side0, side1, side2, triangleType)
    }
}