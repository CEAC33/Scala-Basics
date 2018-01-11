package demo

// package

class   Person  (   val   name  :   String,   val   age   :   Int)

// Java/static class members == Scala/companion object, companion module
object  Person
{
  val MAX_AGE           =   256
  val MAX_NAME_LENGTH   =   1024

  def apply   (   name  :   String,   age   :   Int   ) = new Person(name, age)
}

object  Demo
        extends App
{
  val person0           =   new Person  ("Mike", 45)

  val person1           =   Person.apply("Mike", 45)

  val person2           =   Person      ("Mike", 45)
}