import scala.collection.mutable.ListBuffer

class Pralindrome {
  val firstTenPrimes = Array.apply(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
  val range: Range = 2 until 10000
  var numbers: ListBuffer[Int] = range.to[ListBuffer]

  def getBiggestWithinLimit: Int = {
    for (prime: Int <- firstTenPrimes) {
      for (number: Int <- numbers) {
        if ((number.toString != number.toString.reverse) || (number % prime == 0) ) {
          numbers -= number
        }
      }
    }

    return numbers.last
  }
}

object Main {
  def main(args: Array[String]) {
    val pralindrome : Pralindrome = new Pralindrome
    print(pralindrome.getBiggestWithinLimit)
  }
}

