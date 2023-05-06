package week1

object evenOdd {

  var i = 0

  def main(args:Array[String]): Unit= {

    println("Enter The Number")

     val num = scala.io.StdIn.readInt()

    val count = 100 until num
    for (i <- count) {

        if (i % 2 == 0) {
          println("Even Number is :", i)
          val b=i/3
          println(s"Even Number Reminder is :$b")

        }
        else {
          println("Odd number is :", i)
          val c=i/2
          println(s"Odd Numbers Reminder is : $c ")
        }

      }
    println("You Entered Wrong Number (Out Of Range)")

  }}
