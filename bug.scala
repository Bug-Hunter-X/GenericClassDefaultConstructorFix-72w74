```scala
class MyClass[T](val value: T) {
  def this() = this(null.asInstanceOf[T]) //This is the problematic line
}
```