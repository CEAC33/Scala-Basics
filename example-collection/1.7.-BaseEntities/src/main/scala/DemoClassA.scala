package DemoClassA

class   DemoClassA  { }               // like Java CLASS without static members

trait   DemoTraitA  { }               // like Java INTERFACE + ABSTRACT CLASS

object  DemoObjectA { }               // like Java CLASS only with static members + SINGLETON


class   DemoClassB

trait   DemoTraitB

object  DemoObjectB



class DemoDef
{
  // Scala Method in Java style Java
  def f0  (x: Int, y: Int)    :   Int =
  {
    return x * x + y * y;
  }

  // Semicolon Interface
  def f1  (x: Int, y: Int)    :   Int =
  {
    return x * x + y * y
  }

  // Last Expression Return
  def f2  (x: Int, y: Int)    :   Int =
  {
    x * x + y * y
  }

  // Single Expression
  def f3  (x: Int, y: Int)    :   Int =       x * x + y * y

  // Return Type Inference
  def f4  (x: Int, y: Int)            =       x * x + y * y

  // NOT method! Nested Function!
  def g   (x: Int, y: Int)    :   Int =
  {
    def sqr (t: Int) = x * x
    sqr(x) + sqr(y)
  }
}

class DemoVarVal
{
  var m_field     :     Int           =     0                   // Mutable    Field
  val i_field     :     Int           =     0                   // Immutable  Field

  def f   (x: Int, y: Int): Int       =
  {
    var m_local   :     Int           =     x * x               // MUTABLE    Local   Variable
    val i_local   :     Int           =     y * y               // IMMUTABLE  Local   Variable

    m_local                           =     1                   // can    change local VAR
    i_local                           =     1                   // can't  change local VAL

    var obj0                          =     new DemoVarVal
    obj0          .m_field            =     1                   // can    change Field VAR
    obj0          .i_field            =     1                   // can't  change Field VAL
    obj0                              =     new DemoVarVal

    var obj1                          =     new DemoVarVal
    obj1          .m_field            =     1
    obj1          .i_field            =     1
    obj1                              =     new DemoVarVal
  }

  // Parameter Values Immutable == val
  def g   (x: Int, y: String) : Unit  =
  {
    x = 1
  }
}

