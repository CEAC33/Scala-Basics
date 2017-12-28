package Demo

import java.lang._
import scala._
import scala.Predef._

// 1.- Implicit Imports
// 2.- Imports:   like Java
//          name  -> name
//          *     -> _
//          Static Imports
// 3.- Transparent Imports of Java Classes
// 4.- Packages:  like Java

object Demo0
{
  def main(args: Array[String])
  {
    println("\n\n\n")

    println("Hello World! from Demo0")

    println("\n\n\n")
  }
}

// 1.- App, Application
object Demo1 extends App
{
  println("\n\n\n")

  println("Hello World! from Demo1")

  println("\n\n\n")
}
