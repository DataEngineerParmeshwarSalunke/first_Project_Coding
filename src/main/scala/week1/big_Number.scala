package week1

object big_Number {
  def main(args:Array[String]): Unit = {
    var s = " "
    do {
    println("Enter the three values")
    val a = scala.io.StdIn.readInt()

    val b = scala.io.StdIn.readInt()

    val c = scala.io.StdIn.readInt()


    println(s"Entered three Number is : $a  $b  $c  ")

      if (a > b) {

        if (a > c)
          println(s"A is Greater $a")
        else
          println(s"C is Greater  $c")
      } else {

        if (b > c)
          println(s"B is Greater $b ")
        else
          println(s"C is Greater  $c")
      }
      println("if u want to continue press 'yes' or not press 'no'")
       s=scala.io.StdIn.readLine()
    }  while (s=="yes"|| s=="YES")

  }

}
