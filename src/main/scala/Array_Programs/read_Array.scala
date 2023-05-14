package Array_Programs

object read_Array {

  def main(args:Array[String]): Unit={

         println("Enter The Array Size ")
         val size= scala.io.StdIn.readInt()
         var arr= new Array[Int](size)
             println("Enter The Array ")

               for(i <- 0 until(size)){
                arr(i)=scala.io.StdIn.readInt()

               }
               println(s"$size  sized array is =========")
               for(a<- 0 until(size)){
                 print(arr(a) +" " )
               }
  }

}
