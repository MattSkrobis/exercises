package person

import scala.collection.mutable.ListBuffer

/**
  * Created by matt on 20.01.2016.
  */
class Person(t: Array[Task]) {
    val tasks : Array[Task] = t

  def getDoneOnly(): Unit = {
    var result: ListBuffer[Task] = new ListBuffer[Task]
    for (task: Task <- tasks) {
      if (task.done) {
        result += task
      }
    }
    result.foreach(_task =>println(_task.toString()))
  }
}

class Task(n: String, d: Boolean) {
  val name: String = n
  val done: Boolean = d

  override def toString(): String = "" + name + "";
}

object Main {
  def main(args: Array[String]) {
    val task1 : Task = new Task("Assembly T26E4", true)
    val task2 : Task = new Task("Learn Scala", false)
    val john : Person = new Person(Array.apply(task1, task2))
    john.getDoneOnly()
  }
}
