package week1

// write a program tp print ODD number in given range 251-51 like(251,249,247.....)
object oddNumber_InRange {
  def main (args:Array[String]): Unit ={

    for(i <- 251 to 51 by -1){

      if(i%2 !=0)

         print(s" $i")

    }



  }

}
