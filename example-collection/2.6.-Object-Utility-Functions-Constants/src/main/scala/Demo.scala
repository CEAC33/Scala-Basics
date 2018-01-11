// package

import IntLib.max

// 1.- utility "functions"/"constants"
object Demo
{
  def main(args: Array[String])
  {
    println(max(7,3))
  }
}

object IntLib
{
  val MAX_INT = java.lang.Integer.MAX_VALUE
  def max(x: Int, y: Int) = if (x > y) x else y
}