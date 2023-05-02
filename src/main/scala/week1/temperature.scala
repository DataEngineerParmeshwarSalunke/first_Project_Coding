package week1

object temperature {
  def main(args:Array[String]): Unit ={
    println("Enter The Number")
    val c=scala.io.StdIn.readFloat()

    val f=(c*9/5)+32

    println(s"Given Centigrade is $c c : Converted into fahrenheit is $f f")


  }

}
