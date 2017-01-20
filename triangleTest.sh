#!/bin/sh

# 1st part (after exec) represents location of scala binary -- might be under /usr/local/bin/share
# 2nd part (after -cp) represents location of the jar file that was created with mvn command
exec /junk/scala/scala-2.11.8/bin/scala -cp /tmp/scala-assignments/ScalaAssignments/target/ScalaAssignments-0.0.1-SNAPSHOT.jar "$0" "$@"
!#
import java.util.Scanner
import assignments.assignment1.TriangleTest

val t = new TriangleTest()