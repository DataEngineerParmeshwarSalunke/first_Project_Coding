package week1

object kiloGram {
  def main(args:Array[String]): Unit = {
    println("Enter The Number")
    val a=scala.io.StdIn.readInt();

    println("Entered Number is : ", a)

    val b = a*1000f;

    println(s"$a is in Gram $b g")

  }


}
