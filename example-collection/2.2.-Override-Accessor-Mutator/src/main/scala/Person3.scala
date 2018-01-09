

// 1.- make field private / private[this]
// 2.- rename field
// 3.- create accessor 'def fieldName: fieldType = {...}'
// 4.- create mutator  'def fieldName_$eq(...): Unit = ()'

class Person2
{
  private[this] var privateAge    :   Int     =     _

  // accessor
  def age                   : Int =
  {
    println("Hello from accesor!")
    privateAge
  }

  // mutator: fieldName_ = (...)
  def age_ = (value : Int)  : Unit =
  {
    println("Hello from mutator!")
    privateAge = value
  }
}