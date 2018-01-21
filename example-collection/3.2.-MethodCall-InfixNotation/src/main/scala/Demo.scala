// package

// topic: only 1-arity methods
// method call: infix form == "pointless style"
object      Demo
  extends   App
{
  val x0  =   I(1).+(I(2))

  val x1  =   I(1) + I(2)
}

case class  I     (k    : Int)
{
  def       +   (that : I)  : I   =   I(this.k + that.k)
}