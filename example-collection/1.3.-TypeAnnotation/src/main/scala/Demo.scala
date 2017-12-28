

object Demo
{
  // public static int int f(int x, int y) {return x + y;}
  def f(x: Int, y:Int): Int = x + y

  def main(args: Array[String]): Unit =
  {
    // Results
    println("\n\n\nDemo.f(3,3)\t\t\t\tresult:"+Demo.f(3,3)+"\n\n\n")
  }
}

