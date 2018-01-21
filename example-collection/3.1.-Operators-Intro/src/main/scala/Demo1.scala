// package

object Demo1
{
  // prefix
  val x0 = ~0               // Int bitwise negation
  val x1 = 0.unary_~

  // infix
  val y0 = 0 + 1            // Int addition
  val y1 = 0.+(1)

  // postfix
  val z0 = 0 toByte         // Int->Byte conversion
  val z1 = 0.toByte
}