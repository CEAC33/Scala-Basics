

// companion class
class Example
{
  def f(x: Int): Int = x + 1
}

// companion class
object ExampleO
{
  def g(x: Int): Int = x + 1
}

object Demo
{
  def main(args: Array[String]): Unit =
  {
    // Java: class-instance method        |   Scala: class  method
    new Example().f(0)

    // Java: static method, class method  |   Scala: object method
    ExampleO.g(0)

    // Results
    println("\n\n\n// Java: class-instance method        |   Scala: class  method")
    println("new Example().f(0) \t\t\t\tresult:"+new Example().f(0))
    println("\n// Java: static method, class method  |   Scala: object method")
    println("ExampleO.g(0) \t\t\t\t\tresult:"+ExampleO.g(0)+"\n\n\n")
  }
}