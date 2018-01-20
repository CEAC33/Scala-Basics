//package

class   Demo1
{
  def property  =
  {
    val x = 44
    val y = x + 1
    y
  }
}

object  Demo1Test
        extends App
{
  val age       = new Demo1().property
}

/*

  Uniform Acess Principle
  All services offered by a module should be available through a uniform notation,
  which does not betray whether they are implemented through storage or through computation

 */