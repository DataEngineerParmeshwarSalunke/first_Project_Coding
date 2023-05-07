package week1
  // write a program tp print EVEN number in given range 700-900
object evenNumberIn_Range {
  def main (args:Array[String]): Unit ={

  val num = 700 to 900

    for(i<-num){

       if(i%2 ==0)
         println(s"Even NUmber is  :  $i")



    }

  }

}
