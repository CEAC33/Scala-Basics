// package

import java.lang.Integer.valueOf
import java.lang.Double.{isInfinite => isInf, isNaN}
import java.lang.Float._

object Demo1
{
  val x = valueOf("42")
  def y(d: Double) = isInf(_) || isNaN(_)
  val z = floatToRawIntBits(0.1f)
}