package week1

// write a program tp print EVEN number in given range 700-900
object sumAll_InRange {
  def main (args:Array[String]): Unit ={

     val num = 56 to 153
     var sum= 0

      for(i<-num){

        sum = i+sum

    }
    println(s"Sum of all number  is  :  $sum")


  }

}
