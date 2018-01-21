// package

// infix form == "pointless style" != "point-free style"
object    Demo1
  extends App
{
  val cos   :   Double    =>    Math.cos
  val sin   :   Double    =>    Math.sin

  val f     :   Double    =>    x => cos(sin(x))

  // "point-free style"
  val g     :   Double    =>    cos compose sin
}