package Array_Programs

object array_String {
  def main(array: Array[String]): Unit = {

    val str = new Array[String](5)

    str(0) = "Parmeshwar"
    str(1) = "Karthik"
    str(2) = "Sandeep"
    str(3) = "Deepak"
    str(4) = "Rajesh"

             for(i <- str){

               print(s" $i")
             }
               println()

             for(x <- 0 to (str.length -1)){

                print(str(x)+ " ")
             }
                println("\n Size of the array is  :" + str.length)
  }
}
