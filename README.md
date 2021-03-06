# scala-assignments

To compile and run tests with maven (must have maven installed)

1) open command/DOS prompt  
2) change dir to location of scala-assignments (where files where originally downloaded/cloned to)  
3) change dir to ScalaAssignments  
4) run this command: mvn -U clean install test -- this should build a jar file and also run unit tests  
5) example output to console should include:  

[INFO] Surefire report directory: /tmp/scala-assignments/ScalaAssignments/target/surefire-reports  

-------------------------------------------------------   
 T E S T S   
-------------------------------------------------------   
Running assignments.TestAssignment2   
Linked list element values: 5, 4, 3, 2, 1   
Value of element at position 5 spots from end is 5   
Linked list element values: 9, 3.2, DEF, 100, 6, xyz, 4.5, abcef, 3, 2, 1   
Value of element at position 5 spots from end is 4.5   
Linked list element values: <empty list>   
List does not contain sufficient elements for one to be 5 spots from end   
Linked list element values: 4, 3, 2, 1   
List does not contain sufficient elements for one to be 5 spots from end   
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.195 sec - in assignments.TestAssignment2   
Running assignments.TestAssignment1   
At least one input is invalid -- the given side lengths do not represent a triangle.   
A triangle with side lengths of 1, 1, and 1 is equilateral.   
A triangle with side lengths of 2, 1, and 2 is isosceles.   
A triangle with side lengths of 2, 3, and 1 is scalene.   
A triangle with side lengths of 2, 1, and 1 is isosceles.   
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in assignments.TestAssignment1   
Running assignments.TestAssignment3   
Given 2 lists A & B, where A=List(abc, 4.2, DEF, 3) and B=List(3, 3, DEF, 5, 4.2, abc, 7), are all elements of one list in the other? true   
Given 2 lists A & B, where A=List() and B=List(), are all elements of one list in the other? true   
At least one of the lists is null; therefore, whether all elements of one list are in the other cannot be evaluated.   
Given 2 lists A & B, where A=List() and B=List(ghi, 3, DEF, 5, 4.2, abc, 7), are all elements of one list in the other? true   
Given 2 lists A & B, where A=List(ghi, 3, DEF, 5, 4.2, abc, 7) and B=List(), are all elements of one list in the other? true   
Given 2 lists A & B, where A=List(ghi, 3, DEF, 5, 4.2, abc, 7) and B=List(abc, 4.2, DEF, 3), are all elements of one list in the other? true   
Given 2 lists A & B, where A=List(ghi, DEF, 5, 4.2, abc, 7) and B=List(abc, 4.2, DEF, 3), are all elements of one list in the other? false   
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in assignments.TestAssignment3   
   
Results :   
   
Tests run: 18, Failures: 0, Errors: 0, Skipped: 0   
   
[INFO]   
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ ScalaAssignments ---   
[INFO] Building jar: /tmp/scala-assignments/ScalaAssignments/target/ScalaAssignments-0.0.1-SNAPSHOT.jar   
   
6) The triangleTest.sh script can be used to manually execute the triangle test (from TestAssignment1)   
   - you will need to modify the exec line to indicate the locations of:   
     a) scala binary on your system -- might be just "scala" if it's in the current path or /usr/local/bin/share   
	 b) resulting jar file from mvn command run above -- from directory where mvn command was run, should be under scala-assignments/ScalaAssignments/target/ScalaAssignments-0.0.1-SNAPSHOT.jar   
	 c) save file and run ./triangleTest.sh   
	 d) Example outputs:   
	    
./test.sh   
This is a test that takes 3 lengths of a triangle and determines if it's equilateral, isosceles, or scalene.   
Input 3 integers in a row (separated by spaces) and press enter: 9 9 9   
A triangle with side lengths of 9, 9, and 9 is equilateral.   
   
./test.sh   
This is a test that takes 3 lengths of a triangle and determines if it's equilateral, isosceles, or scalene.   
Input 3 integers in a row (separated by spaces) and press enter: 1 -3 4   
At least one input is invalid -- the given side lengths do not represent a triangle.   