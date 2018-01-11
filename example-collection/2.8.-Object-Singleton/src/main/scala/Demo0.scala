// package

trait   T
class   C
object  OT  extends T
object  OC  extends C

object  Demo0
        extends App
{
  def   f   (   arg   :   T   )   :   Unit    =     ???

  f ( new T{} )
  f ( OT      )

  def   g   (   arg   :   C   )   :   Unit    =     ???

  g ( new C   )
  g ( OC      )


  def   r   (   arg   :   Any )               =     arg
  match
  {
    case _:   C         =>    "C"
    case _:   T         =>    "T"

    case      OT        =>    "OT"
    case _:   OT.type   =>    "OT"

    case      OC        =>    "OC"
    case _:   OC.type   =>    "OC"

    case      1         =>    "1"
//    case _:   1         =>    "1"
    case _:   Int       =>    "1"
  }
}