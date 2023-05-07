package week1

// write a program tp COUNT EVEN number in given range
object countEvenNumber {
  def main (args:Array[String]): Unit = {

    println("Enter  Number ")
    val a = scala.io.StdIn.readInt()
    var count =0
    var c=0
     while(c<a){

       if(c%2==0){

         count=count+1
       }
       c=c+1

     }
    println(s"Total Even numbers are : $count")
  }
}
