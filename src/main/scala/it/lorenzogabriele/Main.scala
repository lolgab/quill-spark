package it.lorenzogabriele

object Main {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5)

    val lString = l.mkString(" ")

    println(lString)
  }
}
