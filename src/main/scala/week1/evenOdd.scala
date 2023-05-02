package week1

object evenOdd {

  var i = 0

  def main(args:Array[String]): Unit= {

    println("Enter The Number")

    // val num = scala.io.StdIn.readInt()

    val num = 90 to 1000
    for (i <- num) {

      if (i >= 100 && i <= 1000) {

        if (i % 2 == 0) {
          println("Even Number is :", i)

        }
        else {
          println("Odd number is :", i)
        }


      }
      else {
        println(s"The Given Number : $num Is Not In Range 100 to 1000");

      }
    }

  }}
