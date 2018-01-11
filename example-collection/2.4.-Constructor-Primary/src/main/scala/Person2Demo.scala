// package

object  Person2Demo
        extends App
{
  val   person      =     new Person2(45, "Mike")

  //    accessor    ==    getter
  val   age         =     person.age
  //    mutator     ==    setter
  person.age        =     1

  //    accessor    ==    getter
  val   name        =     person.name

  //    mutator     ==    setter
  //    person.name =     "Sara"
}