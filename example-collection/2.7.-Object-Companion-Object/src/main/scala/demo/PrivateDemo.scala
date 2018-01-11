package demo

// companion class
class PrivateDemo
{
  private val classPrivate  = 0
  val         tmp           = PrivateDemo.objectPrivate
}

// companion object
object PrivateDemo
{
  private val objectPrivate = 0
  val         tmp           = new PrivateDemo().classPrivate
}