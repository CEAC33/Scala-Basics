

object Demo
{
  val x           : Int     = 0
  val from0to5    : Range   = x.to(5)             // RichInt

  val s           : String  = "abc"
  val c           : Char    = s.last              // IndexedSeqOptimized
  val capitalized : String  = s.capitalize        // StringLike

  // Results
  def main(args: Array[String]): Unit =
  {
    println("\n\n\n")

    println("  val x           : Int     = 0\n  val from0to5    : x.to(5)                       // RichInt\n\n  val s           : String  = \"abc\"\n  val c           : Char    = s.last              // IndexedSeqOptimized\n  val capitalized : String  = s.capitalize        // StringLike")
    println("\nRESULTS:\n")

    println("x:"          +"\t\t\t" + x)
    println("from0to5:"   +"\t\t"   + from0to5)
    println("")
    println("s:"          +"\t\t\t" + s)
    println("c:"          +"\t\t\t" + c)
    println("capitalized:"+"\t\t"   + capitalized)

    println("\n\n\n")
  }
}