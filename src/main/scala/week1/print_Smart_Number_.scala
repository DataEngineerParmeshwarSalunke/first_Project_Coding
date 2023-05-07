package week1

import scala.reflect.internal.util.Statistics.canEnable.&&

// Write a program to check whether the num. is in range 0-100 then print 90-100 super smart, 80-90 smart,70-80 enough
//              smart,60-70 just smart,35-60 no smart,0-35 dump
object print_Smart_Number_ {
  def main(args: Array[String]) : Unit = {
    println("Enter Valid Number (Range 0-100)")
     val num = scala.io.StdIn.readInt()

     if(num >90 && num<100){

       println("This is Super Smart ")
     }

     else if(num>80 && num<90){

       println("This is smart  ")
     }
     else if(num>70 && num<80){
      println("This is Enough Smart")
    }
    else if(num>60 && num<70 ){
      println("This is Just Smart ")
    }

     else if(num>35 && num<60){
      println("This is No Smart")
    }
     else if(num>0 && num<35){
      println("This is Dump")

    }
    else{
       println(s"Invalid Input : $num , Try again")
     }


  }

}
