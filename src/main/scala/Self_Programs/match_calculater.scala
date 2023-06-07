package Self_Programs

object match_calculater {
  def main(args: Array[String]): Unit = {
    var s=" "
    var a = 0
    var b = 0
    do {
      println("Type any math operation")
      println(" add \n multi.\n sub\n div")
      val oprator = scala.io.StdIn.readLine()

      oprator match {

        case "add"       =>
                                 println("Enter two number")
                                 a=scala.io.StdIn.readInt()
                                 b=scala.io.StdIn.readInt()
                                 val c=a+b
                                 println(s"Addition is  : $c")

        case "multi"          =>
                                 println("Enter two number")
                                 a = scala.io.StdIn.readInt()
                                 b = scala.io.StdIn.readInt()
                                 val d = a * b
                                 println(s"multiplication is  : $d")

        case "sub"    =>
                                println("Enter two number")
                                a = scala.io.StdIn.readInt()
                                b = scala.io.StdIn.readInt()
                                val s = a - b
                                println(s"subtraction is  : $s")

        case "div"  =>
                                println("Enter two number")
                                a = scala.io.StdIn.readInt()
                                b = scala.io.StdIn.readInt()
                                val e = a / b
                                println(s"division is  : $e")

        case _   =>             println("Wrong String")
      }
      println("if you want to continue press 'yes' otherwise 'no'")
      s=scala.io.StdIn.readLine()

    }while(s=="yes" || s=="YES")

  }
}