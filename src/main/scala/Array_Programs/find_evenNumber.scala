package Array_Programs

object find_evenNumber {

  def main(args:Array[String]): Unit={

         println("Enter The Array Size ")
         val size= scala.io.StdIn.readInt()
         var arr= new Array[Int](size)
             println("Enter The Array ")

               for(i <- 0 until(size)){
                arr(i)=scala.io.StdIn.readInt()

               }
               println("Even Number in Array is =========")
               for(a<- 0 until(size)){

                   if(arr(a)%2==0)
                 print(arr(a) +" " )
               }
  }

}
