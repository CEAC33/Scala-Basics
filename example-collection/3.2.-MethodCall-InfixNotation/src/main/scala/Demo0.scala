// package

// topic: only 1-arity methods
// method call: infix form == "pointless style"
object      Demo0
            extends App
{
  val x0  =   I(1).add(I(2))

  val x1  =   I(1) add I(2)
}

case class  I     (k    : Int)
{
  def       add   (that : I)  : I   =   I(this.k + that.k)
}