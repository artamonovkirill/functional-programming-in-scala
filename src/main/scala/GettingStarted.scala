object GettingStarted {

  def abs(n: Int): Long =
    if (n < 0) -n.toLong
    else n

  private def formatAbs(x: Int) =
    s"The absolute value of $x is ${abs(x)}"

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, result: Int): Int =
      if (n <= 0) result
      else go(n - 1, n * result)

    go(n, 0)
  }

  def fibonacci(n: Short): Float = {
    @annotation.tailrec
    def go(n: Short, previous: Float, current: Float): Float =
      if (n == 1) previous
      else go((n - 1).toShort, current, previous + current)

    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }

}