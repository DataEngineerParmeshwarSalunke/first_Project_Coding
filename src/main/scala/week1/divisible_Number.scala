package week1
   // write a program print numbers which is divisible by 11 from range 250 - 550
object divisible_Number {

     def main(args: Array[String]): Unit = {

       val num = 250 to 550

       for (i <- num) {

         if (i % 11 == 0)
           println(i)

       }

     }
}
