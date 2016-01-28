package SillySort

import scala.collection.mutable.ListBuffer

/**
  * Created by matt on 23.01.2016.
  */
class SillySort(n: Array[Int], s: Int) {
  val numbers: Array[Int] = n
  val steps: Int = s
//  var result: ListBuffer[(Int, Int)] = new ListBuffer[(Int, Int)]
  var index: Int = 0

  def perform(): Unit = {

    val withIndex = numbers.view.zipWithIndex.to[ListBuffer]

    for (nubmer <- withIndex){
      if (nubmer._2 == 1){
//        nubmer._1 += 10
      }
    }
//    for (number <- numbers) {
//      result.+=((index, number))
//      index += 1
//    }
//      result.toTreeMap
//    val superResult = TreeMap(result.toMap.toSeq: _*)
//    println(TreeMap(result.toMap.toSeq: _*))

//    for (number <- superResult) {
//          if (result(index) > result(index.to[Int]+1)) {
//            var old_second = numbers(i)
//          }
//      println(number)
//    }

//    println(superResult(1))
//    println(superResult(0))
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var ss: SillySort = new SillySort(Array.apply(1, 3, 4, 2, 5, 6), 3)
    ss.perform()
  }
}

