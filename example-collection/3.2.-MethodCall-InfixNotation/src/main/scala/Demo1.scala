// package

import scala.runtime.RichInt

object    Demo1
  extends App
{
  for (k <- 1 to 10)
  {
    println(k)
  }

  for (k <- 1.to(10))
  {
    println(k)
  }

  val range0 : Range = 1.to(10)
  for (k <- range0)
  {
    println(k)
  }

  val range1 : Range = new RichInt(1).to(10)
  for (k <- range1)
  {
    println(k)
  }
}
