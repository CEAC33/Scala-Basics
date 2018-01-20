// package

object Demo
{
  def f0() : Int  =   {1}
  def f1() : Int  =   1
  def f2()        =   {1}
  def f3()        =   1

  // 1.- the equals sign are  omitted
  // 2.- the result type is   omitted
  // 3.- method defining expression must be a block

  //def g0() : Int      {1}
  //def g1() : Int      1
  //def g2()            {1}
  //def g3()            1

  // AnyVal -> Unit
  def g4() : Unit =   1
  def g5() : Unit =   {1}
  def g6() : Unit =   {return 1}
  // AnyRef -> Unit
  def g7() : Unit =   "A"
  def g8() : Unit =   {"A"}
  def g9() : Unit =   {return "A"}
  // Any    -> Unit
  val any  : Any  =   null
  def ga() : Unit =   any
  def gb() : Unit =   {any}
  def gc() : Unit =   {return any}

}
