package assignments.assignment3

class ListPairChecker(val list0: List[Any], val list1: List[Any]) {
  
   var allOfOneInOther = false
   
   private def checkLists() {  
     
     try {
        val intersection = list0.intersect(list1)
        if (intersection.length == list0.length || intersection.length == list1.length)
           allOfOneInOther = true
     } catch {
       case t: Throwable => //ignore here
     }
   }
   
   checkLists()
   
   override def toString = {
      if (list0 == null || list1 == null)
        "At least one of the lists is null; therefore, whether all elements of one list are in the other cannot be evaluated."
      else
        "Given 2 lists A & B, where A=%s and B=%s, are all elements of one list in the other? %s".format(list0, list1, allOfOneInOther)
   }   
}