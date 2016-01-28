package HappyNumber

/**
  * Created by matt on 28.01.2016.
  */
class HappyNumber() {
  var limit_counter: Int = 0
  val limit: Int = 100

  def rec(number: Int): Unit = {
    var k = 0
    for (n <- 0 until number.toString.split("").length) {
      k += Math.pow(number.toString.split("")(n).toInt, 2).toInt
    }
    limit_counter += 1
    if (k == 1) {
      println(1)
    } else if (limit_counter == limit || (limit_counter == limit && k== 0)) {
      println(0)
    } else {
      rec(k)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val a: HappyNumber = new HappyNumber()
    a.rec(22)
    a.rec(1)
    a.rec(7)
  }
}