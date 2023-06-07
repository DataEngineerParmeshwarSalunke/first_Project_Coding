package Self_Programs

object match_exp {
  def main(args: Array[String]): Unit = {
    var s=" "
    do {
      println("Enter the number")

      val num = scala.io.StdIn.readInt()
      num match {

        case 1 => println("good")

        case 2 => println("very good")

        case 3 => println("Excellent")

        case _ => println("Wrong Number")
      }
      println("if you want to continue press 'yes' otherwise 'no'")
      s=scala.io.StdIn.readLine()

    }while(s=="yes" || s=="YES")

  }
}