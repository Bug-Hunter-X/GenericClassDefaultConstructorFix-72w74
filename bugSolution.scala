```scala
class MyClass[T](val value: Option[T]) {
  def this() = this(None)

  def getValue: T = value.getOrElse(throw new NoSuchElementException("Value is not available"))
}

object Main extends App {
  val myInstance = new MyClass[String]() 
  println(myInstance.value) // Output: None
  //val x = myInstance.getValue //This line will throw exception
  val myInstance2 = new MyClass[String]("Hello")
  println(myInstance2.getValue) //Output: Hello
}
```