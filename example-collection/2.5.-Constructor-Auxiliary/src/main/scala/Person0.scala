// package

// auxiliary constructors
class Person0 (   var   name    :   String,   var   age   :   Int   )
{
  def this  (   age   :   Int     )
  {
    this    (  Person0.DEFAULT_NAME , age  )
  }

  def this  (   name  :   String  )
  {
    this    (   name                , Person0.DEFAULT_AGE)
  }

  def this  ()
  {
    this    (   Person0.DEFAULT_NAME, Person0.DEFAULT_AGE)
  }
}

// 'companion object' as constant holder
object Person0
{
  val   DEFAULT_NAME    =   "Mike"
  val   DEFAULT_AGE     =   45
}