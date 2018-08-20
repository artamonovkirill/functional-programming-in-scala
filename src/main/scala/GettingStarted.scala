object GettingStarted {

  def abs(n: Int): Int =
    if (n < 0) -n
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

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, previous: Int, current: Int): Int =
      if (n == 1) previous
      else go(n - 1, current, previous + current)

    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }

}