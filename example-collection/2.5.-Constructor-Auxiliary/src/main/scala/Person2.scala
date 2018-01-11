// package

// 'named parameters' demo
class   Person2       (   var   name  :   String,   var   age   :   Int   )

object  Person2Demo
        extends App
{
  new Person2 (   "Mike"        ,   45            )
  new Person2 (   name = "Mike" ,   45            )
  new Person2 (   "Mike"        ,   age  = 45     )
  new Person2 (   name = "Mike" ,   age  = 45     )

  // another parameter order!
  new Person2 (   age  = 45     ,   name = "Mike" )
}