package week1

object table_Print {
  def main (args: Array[String]): Unit ={
    println("Enter the Number ")
    val num = scala.io.StdIn.readInt()
    var count =1
    for(i<-1 to  10){

      count= i*num
      println(s" $num * $i = $count")

    }

  }
}
