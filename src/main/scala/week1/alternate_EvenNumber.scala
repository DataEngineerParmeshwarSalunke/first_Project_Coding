package week1

// write a program tp count EVEN number in given range
object countEvenNumber {
  def main (args:Array[String]): Unit ={

      println("Enter The Maximum Number ")
      val a = scala.io.StdIn.readInt()

      val num = 0 to a
      var count=1
          for(i<-num){

              if(i%2 ==0)

              println(s"Even NUmber is  :  $i")
              count = count+i
    }
             println(s"Sum of all even number is  : $count")
  }
}
