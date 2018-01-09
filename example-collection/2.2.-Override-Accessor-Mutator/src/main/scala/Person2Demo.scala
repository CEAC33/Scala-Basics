

object  Person2Demo
        extends App
{
  val   person    =   new Person2

  // accessor demo
  val   age       =   person.age

  // mutator  demo
  person.age      =   45

  // 'parasite' mutators demo
  person.age_$eq(45)
  person.age_     =   (45)
}