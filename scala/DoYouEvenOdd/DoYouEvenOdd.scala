package DoYouEvenOdd

/**
  * Created by matt on 28.01.2016.
  */
class DoYouEvenOdd {
  def perform(): Unit = {
    for (i <- 1 to 99) {
      if (i % 2 != 0) println(i)
    }
  }
  def perform2(): Unit = {
      (1 to 99).filter(i => i % 2 == 1).foreach(println(_))
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val d: DoYouEvenOdd = new DoYouEvenOdd
    d.perform()
    d.perform2()
  }
}