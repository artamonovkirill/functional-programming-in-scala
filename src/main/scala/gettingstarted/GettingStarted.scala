package gettingstarted

object GettingStarted {

  def abs(n: Int): Long =
    if (n < 0) -n.toLong
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, result: Int): Int =
      if (n <= 0) result
      else go(n - 1, n * result)

    go(n, 1)
  }

  def fibonacci(n: Short): Float = {
    @annotation.tailrec
    def go(n: Short, previous: Float, current: Float): Float =
      if (n == 1) previous
      else go((n - 1).toShort, current, previous + current)

    go(n, 0, 1)
  }

  def findFirst[T](array: Array[T], predicate: T => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= array.length) -1
      else if (predicate(array(n))) n
      else loop(n + 1)

    loop(0)
  }

  def isSorted[T](array: Array[T], ordered: (T, T) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean =
      if (n >= array.length - 1) true
      else if (!ordered(array(n), array(n + 1))) false
      else loop(n + 1)

    loop(0)
  }

  def partial[A, B, C](a: A, f: (A, B) => C): B => C =
    f(a, _) // b => f(a, b)

  def curry[A, B, C](f: (A, B) => C): A => B => C =
    a => f(a, _) //b => a => f(a, b) //f.curried

  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b) //Function.uncurried(f)

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    f compose g //g andThen f //f(g(_)) //a => f(g(a))

  private def formatResult(name: String, n: Int, f: Int => Long) =
    s"The $name of $n is ${f(n)}"

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute", -42, abs))
    println(formatResult("factorial", 7, factorial))
    println(formatResult("increment", 1, _ + 1))
    println(findFirst(Array(7, 9, 13), (x: Int) => x == 9))
  }

}
