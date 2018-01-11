// package

// 'default parameters' values
class   Person1   (   var   name  :   String  =   "Mike",   var   age   :   Int   =   45)

object  Person1Demo
        extends App
{
  new Person1()

  new Person1("A")

  new Person1( age = 0)

  new Person1("A", 0)
}