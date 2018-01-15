// package

class Demo
{
  // Scala method in Java style Java
  def f0 (x: Int, y: Int): Int  =
  {
    return x * x + y * y;
  }

  // Semicolon inference
  def f1 (x: Int, y: Int): Int  =
  {
    return x * x + y * y
  }


  // Last expression return
  def f2 (x: Int, y: Int): Int  =
  {
    x * x + y * y
  }

  // Single expression
  def f3 (x: Int, y: Int): Int  = x * x + y * y

  // Return type inference
  def f4 (x: Int, y: Int)       = x * x + y * y
  //def f4 (x, y)       = x * x + y * y

  // Public API- don't use type inference
  //def f  (x: Int , y: Long)      = x * x + y * y
  //def f  (x: Long, y: Int)       = x * x + y * y

  //params == val
  def f5 (x: Int, y: Int): Int = {
    // x = x * x
    // y = y * y
    x + y
  }

  def f6 (x: Int, y: Int): Int = {
    val sqrX = x * x
    val sqrY = y * y
    sqrX + sqrY
  }

  // Nested function!
  def f7 (x: Int, y: Int): Int = {
    def sqr (t: Int) = x * x
    sqr(x) + sqr(y)
  }

  // recursive def definition and return type inference
  // def f (x: Int)         = if (x == 0) 1 else x * f(x - 1)
  // def f (x: Int): Int    = if (x == 0) 1 else x * f(x - 1)

}