package week1

// write a program t0 ALTERNATE  EVEN number in given range i.e. (20, 24, 28....)
object alternate_EvenNumber {
  def main (args:Array[String]): Unit ={


      val num = 20 to 140
          for(i <-num){

              if(i%2 ==0)

              println(s"Even NUmber is  :  $i")

    }
  }
}
    //not actual output